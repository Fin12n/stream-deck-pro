package p143q0;

import androidx.emoji2.text.c;
import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final int a(String str, int i8) {
        c cVarC = c();
        Integer num = null;
        if (cVarC != null) {
            Integer numValueOf = Integer.valueOf(cVarC.d(str, i8));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i8);
    }

    public static final int b(String str, int i8) {
        c cVarC = c();
        Integer num = null;
        if (cVarC != null) {
            Integer numValueOf = Integer.valueOf(cVarC.f(str, Math.max(0, i8 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i8);
    }

    public static final c c() {
        if (c.k()) {
            c cVarC = c.c();
            if (cVarC.g() == 1) {
                return cVarC;
            }
        }
        return null;
    }
}
