package com.google.p114b.p120f.p121a;

import com.tencent.matrix.trace.core.AppMethodBeat;

/* renamed from: com.google.b.f.a.b */
public enum C8737b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    public final int bBk;
    private final int[] bBw;

    static {
        AppMethodBeat.m2505o(57242);
    }

    private C8737b(int[] iArr, int i) {
        this.bBw = iArr;
        this.bBk = i;
    }

    /* renamed from: a */
    public final int mo19751a(C0902c c0902c) {
        int i = c0902c.bBA;
        if (i <= 9) {
            i = 0;
        } else if (i <= 26) {
            i = 1;
        } else {
            i = 2;
        }
        return this.bBw[i];
    }
}
