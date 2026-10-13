package G;

import A.C0864c0;
import A.C0868e0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class A implements Q.A {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {
        public abstract C0864c0.g a();

        public abstract Q.B b();
    }

    public static void b(File file, byte[] bArr) throws C0868e0 {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new O.c().b(bArr));
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e8) {
            throw new C0868e0(1, "Failed to write to temp file", e8);
        }
    }

    @Override // Q.A
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0864c0.h apply(a aVar) throws C0868e0 {
        Q.B b8 = aVar.b();
        aVar.a();
        File fileB = AbstractC0961u.b(null);
        b(fileB, (byte[]) b8.c());
        I.f fVarD = b8.d();
        Objects.requireNonNull(fVarD);
        AbstractC0961u.g(fileB, fVarD, null, b8.f());
        return new C0864c0.h(AbstractC0961u.f(fileB, null), 256);
    }
}
