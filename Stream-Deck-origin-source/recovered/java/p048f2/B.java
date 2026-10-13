package p048f2;

import G6.d;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface B {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, d dVar);

    Object writeTo(Object obj, OutputStream outputStream, d dVar);
}
