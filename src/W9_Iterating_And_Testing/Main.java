package W9_Iterating_And_Testing;

import W9_Iterating_And_Testing.Unit.Unit;
import W9_Iterating_And_Testing.Unit.UnitTester;

public class Main {

    public static void main(String[] args) {
        UnitTester tester = new UnitTester();
        Unit unit = new Unit(1500);
        tester.testType(unit, "infantry", "infantry");
        tester.testChangeProperty(unit, "hitPoints", 50, 50);
        tester.testUnitSpecificProperty(unit, "hitPoints", 50, 50);
        tester.testNonExistentProperty(unit, "strength");

    }


}
