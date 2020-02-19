package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void JobAscByName() {
        Job job1 = new Job("Fix bug1", 1);
        Job job2 = new Job("Fix bug2", 4);
        Job job3 = new Job("Fix bug3", 2);
        Job job4 = new Job("X task", 0);

        List<Job> jobs = Arrays.asList(
                job1,
                job2,
                job4,
                job3
        );

        List<Job> jobsSorted = Arrays.asList(
                job1,
                job2,
                job3,
                job4
        );
        jobs.sort(new JobAscByName());
        assertThat(jobs, is(jobsSorted));
    }

    @Test
    public void JobDescByName() {
        Job job1 = new Job("Fix bug1", 1);
        Job job2 = new Job("Fix bug2", 4);
        Job job3 = new Job("Fix bug3", 2);
        Job job4 = new Job("X task", 0);

        List<Job> jobs = Arrays.asList(
                job1,
                job2,
                job4,
                job3
        );

        List<Job> jobsAssert = Arrays.asList(
                job4,
                job3,
                job2,
                job1
        );
        jobs.sort(new JobDescByName());
        assertThat(jobs, is(jobsAssert));
    }

    @Test
    public void JobAscByPriority() {
        Job job1 = new Job("Fix bug1", 1);
        Job job2 = new Job("Fix bug2", 4);
        Job job3 = new Job("Fix bug3", 2);
        Job job4 = new Job("X task", 0);

        List<Job> jobs = Arrays.asList(
                job1,
                job2,
                job4,
                job3
        );

        List<Job> jobsAssert = Arrays.asList(
                job4,
                job1,
                job3,
                job2
        );
        jobs.sort(new JobAscByPriority());
        assertThat(jobs, is(jobsAssert));
    }

    @Test
    public void JobDescByPriority() {
        Job job1 = new Job("Fix bug1", 1);
        Job job2 = new Job("Fix bug2", 4);
        Job job3 = new Job("Fix bug3", 2);
        Job job4 = new Job("X task", 0);

        List<Job> jobs = Arrays.asList(
                job1,
                job2,
                job4,
                job3
        );

        List<Job> jobsAssert = Arrays.asList(
                job2,
                job3,
                job1,
                job4
        );
        jobs.sort(new JobDescByPriority());
        assertThat(jobs, is(jobsAssert));
    }

    @Test
    public void JobDescByPriorityAndDescByName() {
        Job job1 = new Job("Fix bug1", 2);
        Job job2 = new Job("Fix bug2", 4);
        Job job3 = new Job("Fix bug3", 2);
        Job job4 = new Job("X task", 0);

        List<Job> jobs = Arrays.asList(
                job1,
                job2,
                job4,
                job3
        );

        List<Job> jobsAssert = Arrays.asList(
                job2,
                job3,
                job1,
                job4
        );
        jobs.sort(new JobDescByPriority().thenComparing(new JobDescByName()));
        assertThat(jobs, is(jobsAssert));
    }

    @Test
    public void JobDescByPriorityAndAscByName() {
        Job job1 = new Job("Fix bug1", 2);
        Job job2 = new Job("Fix bug2", 4);
        Job job3 = new Job("Fix bug3", 2);
        Job job4 = new Job("X task", 0);

        List<Job> jobs = Arrays.asList(
                job1,
                job2,
                job4,
                job3
        );

        List<Job> jobsAssert = Arrays.asList(
                job2,
                job1,
                job3,
                job4
        );
        jobs.sort(new JobDescByPriority().thenComparing(new JobAscByName()));
        assertThat(jobs, is(jobsAssert));
    }
}
