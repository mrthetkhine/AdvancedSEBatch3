package com.turing.advancedse3.designpattern.composite;

public class CompositeDemo {
	public static void main(String[] args) {
        ViewGroup viewGroup = new ViewGroup("parentGroup");
        View view1 = new View("view1");
        View view2 = new View("view2");
        viewGroup.add(view1);
        viewGroup.add(view2);
        
        ViewGroup viewGroup2 = new ViewGroup("childGroup");
        viewGroup2.add(new View("leve2child"));
        
        viewGroup.add(viewGroup2);
        
        viewGroup.paint();
    }
}
