package org.launchcode.techjobs_oo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;



public class JobTest {
    private static Job job1;
    private static Job job2;
    private static Job job3;

    @Before
    public void setUp(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId(){
        Assert.assertNotEquals("Job IDs should not be equal!!!",job1.getId(),job2.getId());
        Assert.assertEquals("Difference between each following job id should be 1",1, (job2.getId() - job1.getId()));
    }

    @Test
    public void testSettingJobInfo(){
        Assert.assertEquals("Product tester", job3.getName());
        Assert.assertEquals("ACME", job3.getEmployer().toString());
        Assert.assertEquals("Desert", job3.getLocation().toString());
        Assert.assertEquals("Quality control", job3.getPositionType().toString());
        Assert.assertEquals("Persistence", job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(job1.equals(job3));
    }

}
