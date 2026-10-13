package H1;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f3473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f3474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3478f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static p a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.b(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        public static Person b(p pVar) {
            return new Person.Builder().setName(pVar.e()).setIcon(pVar.c() != null ? pVar.c().u() : null).setUri(pVar.f()).setKey(pVar.d()).setBot(pVar.g()).setImportant(pVar.h()).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f3479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f3480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f3482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3484f;

        public p a() {
            return new p(this);
        }

        public b b(boolean z8) {
            this.f3483e = z8;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f3480b = iconCompat;
            return this;
        }

        public b d(boolean z8) {
            this.f3484f = z8;
            return this;
        }

        public b e(String str) {
            this.f3482d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f3479a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f3481c = str;
            return this;
        }
    }

    public p(b bVar) {
        this.f3473a = bVar.f3479a;
        this.f3474b = bVar.f3480b;
        this.f3475c = bVar.f3481c;
        this.f3476d = bVar.f3482d;
        this.f3477e = bVar.f3483e;
        this.f3478f = bVar.f3484f;
    }

    public static p a(Person person) {
        return a.a(person);
    }

    public static p b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.a(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString(SubscriberAttributeKt.JSON_NAME_KEY)).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f3474b;
    }

    public String d() {
        return this.f3476d;
    }

    public CharSequence e() {
        return this.f3473a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        String strD = d();
        String strD2 = pVar.d();
        if (strD == null && strD2 == null) {
            return Objects.equals(Objects.toString(e()), Objects.toString(pVar.e())) && Objects.equals(f(), pVar.f()) && Boolean.valueOf(g()).equals(Boolean.valueOf(pVar.g())) && Boolean.valueOf(h()).equals(Boolean.valueOf(pVar.h()));
        }
        return Objects.equals(strD, strD2);
    }

    public String f() {
        return this.f3475c;
    }

    public boolean g() {
        return this.f3477e;
    }

    public boolean h() {
        return this.f3478f;
    }

    public int hashCode() {
        String strD = d();
        return strD != null ? strD.hashCode() : Objects.hash(e(), f(), Boolean.valueOf(g()), Boolean.valueOf(h()));
    }

    public Person i() {
        return a.b(this);
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f3473a);
        IconCompat iconCompat = this.f3474b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.t() : null);
        bundle.putString("uri", this.f3475c);
        bundle.putString(SubscriberAttributeKt.JSON_NAME_KEY, this.f3476d);
        bundle.putBoolean("isBot", this.f3477e);
        bundle.putBoolean("isImportant", this.f3478f);
        return bundle;
    }
}
