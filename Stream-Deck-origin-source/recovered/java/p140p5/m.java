package p140p5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import p024c5.C1826c;
import p024c5.d;
import p024c5.g;
import p024c5.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1826c f31293b = C1826c.a(m.class).b(p.g(C2799i.class)).b(p.g(Context.class)).d(new g() { // from class: p5.E
        @Override // p024c5.g
        public final Object a(d dVar) {
            return new m((Context) dVar.a(Context.class));
        }
    }).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31294a;

    public m(Context context) {
        this.f31294a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    public final SharedPreferences b() {
        return this.f31294a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
