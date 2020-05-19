package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Job;
import org.junit.Before;
import org.junit.Test;

import javax.swing.text.Position;

import static org.junit.Assert.*;

public class JobTest {

// create a new object
    Job test_job1;
    Job test_job2;
    Job test_job3;

    //use @Before to create two new objects

    @Before
    public void createJobObject() {
        test_job1 = new Job("Web Developer", new Employer("Anheuser Busch"), new Location("St Louis"), new PositionType("Bulk Shipment Portal Coder"), new CoreCompetency("JavaScript"));
        test_job2 = new Job("Data Scientist", new Employer("REI"), new Location("Seattle"), new PositionType("Sales Analytics"), new CoreCompetency("Python"));
//        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    // test the job id setting so that ID differs by just one and is not the same
    @Test
    public void testSettingJobId() {
        assertTrue(test_job1.getId() != test_job2.getId() && test_job2.getId() - test_job1.getId() ==1);
        //assertFalse(test_job1.getId() == test_job2.getId());
    }

    //TODO: constructor sets all class types and values properly
    @Test

    public void testJobConstructorSetsAllFields() {
        Job fakeJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(fakeJob instanceof Job);
        assertTrue(Integer.class.isInstance(fakeJob.getId()));
        assertTrue(fakeJob.getEmployer() instanceof Employer);
        assertTrue(fakeJob.getLocation() instanceof Location);
        assertTrue(fakeJob.getPositionType() instanceof PositionType);
        assertTrue(fakeJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(fakeJob.getName() == "Product tester");
        assertTrue(fakeJob.getEmployer().getValue() == "ACME");
        assertTrue(fakeJob.getLocation().getValue()=="Desert");
        assertTrue(fakeJob.getPositionType().getValue() == "Quality control");
        assertTrue(fakeJob.getCoreCompetency().getValue() == "Persistence");

    }

    //TODO: tests if two job objects are equal
    @Test

    public void testJobsForEquality() {
        Job fakeJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job fakeJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(fakeJob1.equals(fakeJob2));
    }

    //TODO: tests toString method
    @Test

    public void testsToStringPrintFormat() {
        Job fakeJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "ID: " + fakeJob1.getId() + "\n" +
                "Name: " + fakeJob1.getName() + "\n" +
                "Employer: " + fakeJob1.getEmployer() +  "\n" +
                "Location: " + fakeJob1.getLocation() + "\n" +
                        "Position Type: " + fakeJob1.getPositionType() + "\n" +
                        "Core Competency: " + fakeJob1.getCoreCompetency() + "\n"
                , fakeJob1.toString());
    }

}

