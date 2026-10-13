package p209y2;

import A2.g;
import A2.j;
import C6.G;
import D6.C0937q;
import N6.a;
import Z6.v;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.t;
import p193w2.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final CancellationSignal a() {
        return A2.b.b();
    }

    public static final void b(g db) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(db, "db");
        List listC = C0937q.c();
        Cursor cursorP0 = db.P0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorP0.moveToNext()) {
            try {
                listC.add(cursorP0.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a.a(cursorP0, th);
                    throw th2;
                }
            }
        }
        G g8 = G.f1419a;
        a.a(cursorP0, null);
        for (String triggerName : C0937q.a(listC)) {
            t.f(triggerName, "triggerName");
            if (v.H(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db.L("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor c(r db, j sqLiteQuery, boolean z8, CancellationSignal cancellationSignal) {
        t.g(db, "db");
        t.g(sqLiteQuery, "sqLiteQuery");
        Cursor cursorZ = db.z(sqLiteQuery, cancellationSignal);
        if (!z8 || !(cursorZ instanceof AbstractWindowedCursor)) {
            return cursorZ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorZ;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorZ) : cursorZ;
    }

    public static final int d(File databaseFile) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i8 = byteBufferAllocate.getInt();
            a.a(channel, null);
            return i8;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(channel, th);
                throw th2;
            }
        }
    }
}
