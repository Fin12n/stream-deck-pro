package p060g5;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p042e5.c;
import p042e5.e;
import p042e5.f;
import p042e5.g;
import p042e5.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements p051f5.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f23773e = new e() { // from class: g5.a
        @Override // p042e5.b
        public final void a(Object obj, Object obj2) {
            d.c(obj, (f) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f23774f = new g() { // from class: g5.b
        @Override // p042e5.b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).c((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f23775g = new g() { // from class: g5.c
        @Override // p042e5.b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).d(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f23776h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23777a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23778b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f23779c = f23773e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23780d = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements p042e5.a {
        public a() {
        }

        @Override // p042e5.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f23777a, d.this.f23778b, d.this.f23779c, d.this.f23780d);
            eVar.f(obj, false);
            eVar.m();
        }

        @Override // p042e5.a
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f23782a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f23782a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // p042e5.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, h hVar) {
            hVar.c(f23782a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f23774f);
        m(Boolean.class, f23775g);
        m(Date.class, f23776h);
    }

    public static /* synthetic */ void c(Object obj, f fVar) {
        throw new c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public p042e5.a i() {
        return new a();
    }

    public d j(p051f5.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z8) {
        this.f23780d = z8;
        return this;
    }

    @Override // p051f5.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, e eVar) {
        this.f23777a.put(cls, eVar);
        this.f23778b.remove(cls);
        return this;
    }

    public d m(Class cls, g gVar) {
        this.f23778b.put(cls, gVar);
        this.f23777a.remove(cls);
        return this;
    }
}
