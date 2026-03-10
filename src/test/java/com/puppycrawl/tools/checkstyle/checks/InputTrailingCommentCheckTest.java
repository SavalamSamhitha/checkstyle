package com.puppycrawl.tools.checkstyle.checks.trailingcomment;

class InputTrailingCommentVerticalAlignment {

    void test() {
        int a = 1;   // comment
        int bb = 2;      // misaligned comment
        int ccc = 3; // comment
    }
}