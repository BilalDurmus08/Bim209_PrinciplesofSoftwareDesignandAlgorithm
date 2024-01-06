package W9_Iterating_And_Testing.Unit;

import W9_Iterating_And_Testing.Unit.Unit;

public class UnitTester {

    public void testType(Unit unit, String Type, String expectedType) {
        System.out.println("\nSetter and Getter Tester");
        unit.setType(Type);
        String typeAfter = unit.getType();
        if (typeAfter.equals(expectedType)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed " + typeAfter + " didn't match " + expectedType);
        }
    }

    public void testUnitSpecificProperty(Unit unit, String propertyName, Object property, Object expectedObject) {
        System.out.println("\nTesting setter and getter a unit specific property");
        unit.setProperty(propertyName, property);
        Object objectAfter = unit.getProperty(propertyName);
        if (objectAfter.equals(expectedObject)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed " + objectAfter + " didn't match " + expectedObject);
        }
    }

    public void testChangeProperty(Unit unit, String propertyName, Object property, Object expectedObject) {
        System.out.println("\nTesting an existing property's value");
        unit.setProperty(propertyName, property);
        Object objectAfter = unit.getProperty(propertyName);
        if (objectAfter.equals(expectedObject)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed " + objectAfter + " didn't match " + expectedObject);
        }
    }

    public void testNonExistentProperty(Unit unit, String propertyName) {
        System.out.println("\nTesting nonExist value");
        Object objectAfter = unit.getProperty(propertyName);
        if (objectAfter == null) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed " + objectAfter + " exist. I is not null");
        }
    }

}
