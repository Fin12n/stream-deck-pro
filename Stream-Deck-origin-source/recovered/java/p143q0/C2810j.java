package p143q0;

import Z0.d;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: renamed from: q0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2810j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f31862a;

    public final Integer a(KeyEvent keyEvent) {
        int iC = d.c(keyEvent);
        if ((Integer.MIN_VALUE & iC) != 0) {
            this.f31862a = Integer.valueOf(iC & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f31862a;
        if (num == null) {
            return Integer.valueOf(iC);
        }
        this.f31862a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iC));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iC) : num2;
    }
}
