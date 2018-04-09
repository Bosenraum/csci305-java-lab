package main.java.csci305.javalab;

/**
 * Element superclass, extended by each specific move
 *
 * @author Austin Rosenbaum
 */
public abstract class Element {

    private final String name;

    public Element(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract Outcome compareTo(Element e);
}
