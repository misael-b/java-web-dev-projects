package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]", "[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueCase2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]", "[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueCase3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]", "[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueCase4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode", "[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueCase5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("", "[]"));
    }

    @Test
    public void onlyBracketsReturnsFalseCase1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode", "[]"));
    }

    @Test
    public void onlyBracketsReturnsFalseCase2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code[", "[]"));
    }

    @Test
    public void onlyBracketsReturnsFalseCase3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[", "[]"));
    }

    @Test
    public void onlyBracketsReturnsFalseCase4() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][", "[]"));
    }

    @Test
    public void onlyBracketsReturnsFalseCase5() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[C[ode]", "[]"));
    }

    @Test
    public void onlyBracketsReturnsFalseCase6() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[C[ode]", "[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueCase6() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Laun[ch]Code]", "[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueDifferentCharacter() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[Laun[ch]Code]}", "{}"));
    }

    @Test
    public void onlyBracketsReturnsFalseDifferentCharacterCase2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("}[Laun[ch]Code]}", "{}"));
    }

    @Test
    public void onlyBracketsReturnsFalseCase7() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[lkf]ff]f[f", "[]"));
    }
    @Test
    public void onlyBracketsReturnsTrueCase7() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[][]]]]", "[]"));
    }





}