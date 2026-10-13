package p076i3;

import p004a3.C1705k;
import p004a3.J;
import p022c3.c;
import p022c3.l;
import p085j3.b;
import p121n3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24651c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i8) {
            if (i8 == 1) {
                return MERGE;
            }
            if (i8 == 2) {
                return ADD;
            }
            if (i8 == 3) {
                return SUBTRACT;
            }
            if (i8 != 4) {
                return i8 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public j(String str, a aVar, boolean z8) {
        this.f24649a = str;
        this.f24650b = aVar;
        this.f24651c = z8;
    }

    @Override // p076i3.c
    public c a(J j8, C1705k c1705k, b bVar) {
        if (j8.A()) {
            return new l(this);
        }
        d.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f24650b;
    }

    public String c() {
        return this.f24649a;
    }

    public boolean d() {
        return this.f24651c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f24650b + '}';
    }
}
