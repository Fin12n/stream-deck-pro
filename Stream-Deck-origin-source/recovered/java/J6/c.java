package J6;

import D6.AbstractC0922b;
import D6.C0934n;
import java.io.Serializable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC0922b implements a, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enum[] f4354b;

    public c(Enum<Object>[] entries) {
        t.g(entries, "entries");
        this.f4354b = entries;
    }

    public int A(Enum element) {
        t.g(element, "element");
        return indexOf(element);
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f4354b.length;
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return o((Enum) obj);
        }
        return false;
    }

    @Override // D6.AbstractC0922b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return y((Enum) obj);
        }
        return -1;
    }

    @Override // D6.AbstractC0922b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return A((Enum) obj);
        }
        return -1;
    }

    public boolean o(Enum element) {
        t.g(element, "element");
        return ((Enum) C0934n.U(this.f4354b, element.ordinal())) == element;
    }

    @Override // D6.AbstractC0922b, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Enum get(int i8) {
        AbstractC0922b.f1937a.b(i8, this.f4354b.length);
        return this.f4354b[i8];
    }

    public int y(Enum element) {
        t.g(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C0934n.U(this.f4354b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }
}
