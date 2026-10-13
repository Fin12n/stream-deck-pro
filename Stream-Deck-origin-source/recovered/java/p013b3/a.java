package p013b3;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import p121n3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i8) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(i.c(i8, 0, 255));
        } else {
            setColor((i.c(i8, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public a(int i8) {
        super(i8);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i8, PorterDuff.Mode mode) {
        super(i8);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
