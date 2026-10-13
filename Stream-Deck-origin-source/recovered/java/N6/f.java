package N6;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Y6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f7513a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7515b;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f7514a;
            this.f7514a = null;
            t.d(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f7514a == null && !this.f7515b) {
                String line = f.this.f7513a.readLine();
                this.f7514a = line;
                if (line == null) {
                    this.f7515b = true;
                }
            }
            return this.f7514a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(BufferedReader reader) {
        t.g(reader, "reader");
        this.f7513a = reader;
    }

    @Override // Y6.g
    public Iterator iterator() {
        return new a();
    }
}
