package A2;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface g extends Closeable {
    void B();

    List F();

    boolean F1();

    void K(int i8);

    void L(String str);

    Cursor N1(j jVar);

    Cursor P0(String str);

    k V(String str);

    void W0();

    Cursor e0(j jVar, CancellationSignal cancellationSignal);

    boolean isOpen();

    String w();

    boolean w1();

    void x0();

    void z0();
}
