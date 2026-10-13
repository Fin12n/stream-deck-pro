package io.sentry;

import io.sentry.protocol.C2539a;
import io.sentry.protocol.C2540b;
import io.sentry.protocol.C2541c;
import io.sentry.protocol.C2542d;
import io.sentry.protocol.C2543e;
import io.sentry.protocol.C2544f;
import io.sentry.protocol.C2545g;
import io.sentry.protocol.C2546h;
import io.sentry.protocol.DebugImage;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2586x0 implements InterfaceC2484c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f27797c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f27799b;

    public C2586x0(J2 j8) {
        this.f27798a = j8;
        HashMap map = new HashMap();
        this.f27799b = map;
        map.put(C2539a.class, new C2539a.C0602a());
        map.put(C2491e.class, new C2491e.a());
        map.put(C2540b.class, new C2540b.a());
        map.put(C2541c.class, new C2541c.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(C2542d.class, new C2542d.a());
        map.put(C2543e.class, new C2543e.a());
        map.put(C2543e.b.class, new C2543e.b.a());
        map.put(C2545g.class, new C2545g.a());
        map.put(C2546h.class, new C2546h.a());
        map.put(io.sentry.protocol.i.class, new io.sentry.protocol.i.a());
        map.put(io.sentry.protocol.j.class, new io.sentry.protocol.j.a());
        map.put(io.sentry.protocol.k.class, new io.sentry.protocol.k.a());
        map.put(C2497f1.class, new C2497f1.b());
        map.put(C2501g1.class, new C2501g1.a());
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.profilemeasurements.a.C0601a());
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.profilemeasurements.b.a());
        map.put(io.sentry.protocol.l.class, new io.sentry.protocol.l.a());
        map.put(C2517k1.class, new C2517k1.b());
        map.put(io.sentry.rrweb.a.class, new io.sentry.rrweb.a.C0603a());
        map.put(io.sentry.rrweb.c.class, new io.sentry.rrweb.c.a());
        map.put(io.sentry.rrweb.e.class, new io.sentry.rrweb.e.a());
        map.put(io.sentry.rrweb.f.class, new io.sentry.rrweb.f.a());
        map.put(io.sentry.rrweb.g.class, new io.sentry.rrweb.g.a());
        map.put(io.sentry.rrweb.i.class, new io.sentry.rrweb.i.a());
        map.put(io.sentry.rrweb.j.class, new io.sentry.rrweb.j.a());
        map.put(io.sentry.protocol.n.class, new io.sentry.protocol.n.a());
        map.put(io.sentry.protocol.o.class, new io.sentry.protocol.o.a());
        map.put(X1.class, new X1.a());
        map.put(C2553r2.class, new C2553r2.a());
        map.put(C2557s2.class, new C2557s2.a());
        map.put(io.sentry.protocol.p.class, new io.sentry.protocol.p.a());
        map.put(EnumC2592y2.class, new EnumC2592y2.a());
        map.put(EnumC2596z2.class, new EnumC2596z2.a());
        map.put(A2.class, new A2.a());
        map.put(io.sentry.protocol.v.class, new io.sentry.protocol.v.a());
        map.put(io.sentry.protocol.w.class, new io.sentry.protocol.w.a());
        map.put(K2.class, new K2.a());
        map.put(io.sentry.protocol.x.class, new io.sentry.protocol.x.a());
        map.put(io.sentry.protocol.y.class, new io.sentry.protocol.y.a());
        map.put(io.sentry.protocol.z.class, new io.sentry.protocol.z.a());
        map.put(N1.class, new N1.a());
        map.put(io.sentry.protocol.A.class, new io.sentry.protocol.A.a());
        map.put(io.sentry.protocol.B.class, new io.sentry.protocol.B.a());
        map.put(Y2.class, new Y2.a());
        map.put(d3.class, new d3.a());
        map.put(i3.class, new i3.a());
        map.put(k3.class, new k3.a());
        map.put(io.sentry.protocol.F.class, new io.sentry.protocol.F.a());
        map.put(C2544f.class, new C2544f.a());
        map.put(x3.class, new x3.a());
        map.put(io.sentry.clientreport.c.class, new io.sentry.clientreport.c.a());
        map.put(io.sentry.protocol.H.class, new io.sentry.protocol.H.a());
        map.put(io.sentry.protocol.G.class, new io.sentry.protocol.G.a());
    }

    @Override // io.sentry.InterfaceC2484c0
    public void a(Object obj, Writer writer) throws IOException {
        io.sentry.util.u.c(obj, "The entity is required.");
        io.sentry.util.u.c(writer, "The Writer object is required.");
        ILogger logger = this.f27798a.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        if (logger.d(enumC2596z2)) {
            this.f27798a.getLogger().c(enumC2596z2, "Serializing object: %s", h(obj, this.f27798a.isEnablePrettySerializationOutput()));
        }
        new C2566u0(writer, this.f27798a.getMaxDepth()).g(this.f27798a.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC2484c0
    public void b(W1 w8, OutputStream outputStream) throws IOException {
        io.sentry.util.u.c(w8, "The SentryEnvelope object is required.");
        io.sentry.util.u.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f27797c));
        try {
            w8.b().serialize(new C2566u0(bufferedWriter, this.f27798a.getMaxDepth()), this.f27798a.getLogger());
            bufferedWriter.write("\n");
            for (C2550q2 c2550q2 : w8.c()) {
                try {
                    byte[] bArrA = c2550q2.A();
                    c2550q2.B().serialize(new C2566u0(bufferedWriter, this.f27798a.getMaxDepth()), this.f27798a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrA);
                    bufferedWriter.write("\n");
                } catch (Exception e8) {
                    this.f27798a.getLogger().b(EnumC2596z2.ERROR, "Failed to create envelope item. Dropping it.", e8);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC2484c0
    public Object c(Reader reader, Class cls) {
        Object objY1;
        try {
            C2555s0 c2555s0 = new C2555s0(reader);
            try {
                InterfaceC2524m0 interfaceC2524m0 = (InterfaceC2524m0) this.f27799b.get(cls);
                if (interfaceC2524m0 != null) {
                    objY1 = cls.cast(interfaceC2524m0.a(c2555s0, this.f27798a.getLogger()));
                } else {
                    if (!g(cls)) {
                        c2555s0.close();
                        return null;
                    }
                    objY1 = c2555s0.y1();
                }
                c2555s0.close();
                return objY1;
            } catch (Throwable th) {
                try {
                    c2555s0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e8) {
            this.f27798a.getLogger().b(EnumC2596z2.ERROR, "Error when deserializing", e8);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC2484c0
    public W1 d(InputStream inputStream) {
        io.sentry.util.u.c(inputStream, "The InputStream object is required.");
        try {
            return this.f27798a.getEnvelopeReader().a(inputStream);
        } catch (IOException e8) {
            this.f27798a.getLogger().b(EnumC2596z2.ERROR, "Error deserializing envelope.", e8);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC2484c0
    public Object e(Reader reader, Class cls, InterfaceC2524m0 interfaceC2524m0) {
        try {
            C2555s0 c2555s0 = new C2555s0(reader);
            try {
                Object objY1 = (!Collection.class.isAssignableFrom(cls) || interfaceC2524m0 == null) ? c2555s0.y1() : c2555s0.O1(this.f27798a.getLogger(), interfaceC2524m0);
                c2555s0.close();
                return objY1;
            } catch (Throwable th) {
                try {
                    c2555s0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f27798a.getLogger().b(EnumC2596z2.ERROR, "Error when deserializing", th3);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC2484c0
    public String f(Map map) {
        return h(map, false);
    }

    public final boolean g(Class cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public final String h(Object obj, boolean z8) {
        StringWriter stringWriter = new StringWriter();
        C2566u0 c2566u0 = new C2566u0(stringWriter, this.f27798a.getMaxDepth());
        if (z8) {
            c2566u0.t("\t");
        }
        c2566u0.g(this.f27798a.getLogger(), obj);
        return stringWriter.toString();
    }
}
