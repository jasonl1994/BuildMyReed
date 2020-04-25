$fs=0.3;
$fa=0.5;

/* [Global] */

// Reed Overall Length (mm)
length=69;
// Reed Back Width (mm)
back_width=11.55;
// Reed Tip End Width (mm)
tip_width=13.05;
// Reed Back Thickness (mm)
back_thickness=2.8;
// Reed Tip Thickness (mm)
tip_thickness=0.09;
// Heart Thickness Level (1-3)
heart=2;
// Reed Tip End Round (mm)
tip_round=5;
// Reed Cylinder Radius (mm)
reed_cyl_rad=18;





module reed_base()
{
	difference()
	{
		union()
		{
			translate([0,0,back_thickness-reed_cyl_rad]) rotate([0,90,0]) 
				cylinder(r=reed_cyl_rad,h=length-tip_round);
 			translate([length-tip_round,0,-0.01]) scale([2 * tip_round / tip_width,1,1])
				cylinder(d=tip_width,h=back_thickness);
		}
        
		translate([-1,-reed_cyl_rad-1,-reed_cyl_rad*2])
			cube([length+2,reed_cyl_rad*2+2,reed_cyl_rad*2]);
		translate([-0.2,back_width*0.5,-1]) rotate([0,0,atan2((tip_width-back_width)*0.5,length)])
			cube([length+1,tip_width,back_thickness+2]);
		translate([-0.2,-back_width*0.5,-1]) rotate([0,0,-atan2((tip_width-back_width)*0.5,length)]) translate([0,-tip_width,0])
			cube([length+1,tip_width,back_thickness+2]);
        
	}
}

module reed()
{
    difference()
    {
        reed_base();
        
        union()
        {
                translate([length+(0.1*(heart+6)),0,tip_width+tip_thickness]) rotate([0,-90 + atan(((back_thickness*(0.1*(heart+2))-tip_thickness)/(length/2))) -0.1,0]) scale([1,5,1])
                    cylinder(h=length/2, r1=tip_width, r2=tip_width, center=false);
     
                translate([length/2,0,back_thickness*(1+((heart+2)*0.1))])scale([2,20,1])
                    sphere(r=back_thickness);
        
        }
    }
}

reed();