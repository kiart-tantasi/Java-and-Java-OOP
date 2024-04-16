package com.example;

public class CloneableDemo implements Cloneable {

    private String value;
    private final SubClass subClass;

    public CloneableDemo(String value, SubClass subClass) throws CloneNotSupportedException {
        this.value = value;
        this.subClass = subClass;
        // this.subClass = (SubClass) subClass.clone(); // to clone subClass
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SubClass getSubClass() {
        return this.subClass;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        var subClass = new SubClass("initial value");
        var firstObj = new CloneableDemo("initial value", subClass);
        var secondObj = firstObj.clone();

        // set value
        firstObj.setValue("set again");
        // firstObj
        System.out.println("first.getValue() - " + firstObj.getValue());
        // secondObj
        System.out.println("secondObj.getValue() - " + ((CloneableDemo) secondObj).getValue());

        System.out.println("===============================================================");

        // set subclass value
        subClass.setSubValue("set again");
        // firstObj
        System.out.println("firstObj.getSubClass().getSubValue() - " + firstObj.getSubClass().getSubValue());
        // secondObj
        System.out.println(
                "secondObj.getSubClass().getSubValue() - " + ((CloneableDemo) secondObj).getSubClass().getSubValue());

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SubClass implements Cloneable {
    private String subValue;

    public SubClass(String subValue) {
        this.subValue = subValue;
    }

    public String getSubValue() {
        return this.subValue;
    }

    public void setSubValue(String subValue) {
        this.subValue = subValue;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
