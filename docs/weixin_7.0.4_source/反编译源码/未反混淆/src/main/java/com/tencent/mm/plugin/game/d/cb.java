package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class cb extends a {
    public String IconUrl;
    public String Title;
    public String mZj;
    public String ncO;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(111636);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.Title != null) {
                aVar.e(1, this.Title);
            }
            if (this.IconUrl != null) {
                aVar.e(2, this.IconUrl);
            }
            if (this.mZj != null) {
                aVar.e(3, this.mZj);
            }
            if (this.ncO != null) {
                aVar.e(4, this.ncO);
            }
            AppMethodBeat.o(111636);
            return 0;
        } else if (i == 1) {
            if (this.Title != null) {
                f = e.a.a.b.b.a.f(1, this.Title) + 0;
            } else {
                f = 0;
            }
            if (this.IconUrl != null) {
                f += e.a.a.b.b.a.f(2, this.IconUrl);
            }
            if (this.mZj != null) {
                f += e.a.a.b.b.a.f(3, this.mZj);
            }
            if (this.ncO != null) {
                f += e.a.a.b.b.a.f(4, this.ncO);
            }
            AppMethodBeat.o(111636);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(111636);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cb cbVar = (cb) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cbVar.Title = aVar3.BTU.readString();
                    AppMethodBeat.o(111636);
                    return 0;
                case 2:
                    cbVar.IconUrl = aVar3.BTU.readString();
                    AppMethodBeat.o(111636);
                    return 0;
                case 3:
                    cbVar.mZj = aVar3.BTU.readString();
                    AppMethodBeat.o(111636);
                    return 0;
                case 4:
                    cbVar.ncO = aVar3.BTU.readString();
                    AppMethodBeat.o(111636);
                    return 0;
                default:
                    AppMethodBeat.o(111636);
                    return -1;
            }
        } else {
            AppMethodBeat.o(111636);
            return -1;
        }
    }
}
