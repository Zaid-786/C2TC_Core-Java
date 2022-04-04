package day_14;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Panel;

public class AppletDemo_5 extends Applet{

Panel1 p1;
Panel2 p2;


public void init()
{
	setLayout(new GridLayout(1,2));

	add(p1=new Panel1());
	add(p2=new Panel2());
}

}


class Panel1 extends Panel
{
Checkbox  c1,c2,c3;

CheckboxGroup gb;

public Panel1()
{
setLayout(new GridLayout(3,1));

gb=new CheckboxGroup();

add(c1=new Checkbox("tour 1",gb,true));
add(c1=new Checkbox("tour 2",gb,true));
add(c1=new Checkbox("tour 3",gb,true));
}

}




class Panel2 extends Panel
{
Checkbox  c1,c2,c3;

public Panel2()
{
setLayout(new GridLayout(3,1));


add(c1=new Checkbox("Manali"));
add(c1=new Checkbox("Shimla"));
add(c1=new Checkbox("DauriaHouse"));
}

}
