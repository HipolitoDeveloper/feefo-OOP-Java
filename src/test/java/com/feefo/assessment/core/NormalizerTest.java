package com.feefo.assessment.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NormalizerTest {

    @Test
    public void normaliseTest() {
        Normalizer normalizer =  new Normalizer();

        Assertions.assertEquals("Software Engineer", normalizer.normalize("Java engineer"));
        Assertions.assertEquals("Software Engineer", normalizer.normalize("C# engineer"));
        Assertions.assertEquals("Accountant", normalizer.normalize("Chief accountant"));
        Assertions.assertEquals("Architect", normalizer.normalize("Registered Architect"));
        Assertions.assertEquals("JobTitle not found", normalizer.normalize("Marketing Manager"));
    }
}
