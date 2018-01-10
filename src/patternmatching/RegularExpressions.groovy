package patternmatching

import java.util.regex.Matcher
import java.util.regex.Pattern

/*
    PATTERN OPERATOR

    ~ pattern operator provides a simple way to create a java.util.regex.Pattern instance
 */

def pattern = ~/foo/
assert pattern instanceof Pattern

/*
    MATCHER OPERATOR

    alternatively to build a pattern you can use the find operator =~
 */

def text = "some text to match"
def matcher = (text =~ /match/)

assert matcher instanceof Matcher

/*
    MATCH OPERATOR
 */

def match = (text ==~ /match/)
assert match instanceof Boolean