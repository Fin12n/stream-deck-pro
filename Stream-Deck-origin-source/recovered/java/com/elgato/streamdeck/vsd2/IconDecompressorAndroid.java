package com.elgato.streamdeck.vsd2;

import M3.i;
import Z2.j;
import Z2.p;
import com.elgato.vsd2.Messages;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class IconDecompressorAndroid implements i {
    private final ImageDecompressor imageDecompressor = new ImageDecompressor(0, 0, 3, null);

    @Override // M3.i
    public Object decompress(Messages.Icon icon) {
        t.g(icon, "icon");
        try {
            ImageDecompressor imageDecompressor = this.imageDecompressor;
            Messages.Image image = icon.getImage();
            t.f(image, "getImage(...)");
            return imageDecompressor.createBitmap(image);
        } catch (Throwable th) {
            j.a aVar = j.f12858c;
            String strC = aVar.c();
            p pVar = p.Error;
            if (aVar.a().a().compareTo(pVar) > 0) {
                return null;
            }
            aVar.b(pVar, strC, th, "Error decoding icon");
            return null;
        }
    }
}
