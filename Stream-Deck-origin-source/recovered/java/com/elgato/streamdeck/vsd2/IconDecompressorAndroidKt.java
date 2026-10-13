package com.elgato.streamdeck.vsd2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class IconDecompressorAndroidKt {
    public static final Bitmap getBitmap(Q3.a aVar) {
        t.g(aVar, "<this>");
        Object objE = aVar.e();
        if (objE instanceof Bitmap) {
            return (Bitmap) objE;
        }
        return null;
    }
}
