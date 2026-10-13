package p219z4;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p010b0.C1749b;

/* JADX INFO: renamed from: z4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3195d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f39158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f39159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f39160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f39161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f39163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q4.a f39166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f39167j;

    /* JADX INFO: renamed from: z4.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f39168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1749b f39169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f39170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f39171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Q4.a f39172e = Q4.a.f9208k;

        public C3195d a() {
            return new C3195d(this.f39168a, this.f39169b, null, 0, null, this.f39170c, this.f39171d, this.f39172e, false);
        }

        public a b(String str) {
            this.f39170c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f39169b == null) {
                this.f39169b = new C1749b();
            }
            this.f39169b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f39168a = account;
            return this;
        }

        public final a e(String str) {
            this.f39171d = str;
            return this;
        }
    }

    public C3195d(Account account, Set<Scope> set, Map<p203x4.a, C3216z> map, int i8, @Nullable View view, String str, String str2, @Nullable Q4.a aVar) {
        this(account, set, map, i8, view, str, str2, aVar, false);
    }

    public Account a() {
        return this.f39158a;
    }

    public Account b() {
        Account account = this.f39158a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f39160c;
    }

    public String d() {
        return this.f39164g;
    }

    public Set e() {
        return this.f39159b;
    }

    public final Q4.a f() {
        return this.f39166i;
    }

    public final Integer g() {
        return this.f39167j;
    }

    public final String h() {
        return this.f39165h;
    }

    public final void i(Integer num) {
        this.f39167j = num;
    }

    public C3195d(@Nullable Account account, Set set, Map map, int i8, @Nullable View view, String str, String str2, @Nullable Q4.a aVar, boolean z8) {
        this.f39158a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f39159b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f39161d = map;
        this.f39163f = view;
        this.f39162e = i8;
        this.f39164g = str;
        this.f39165h = str2;
        this.f39166i = aVar == null ? Q4.a.f9208k : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C3216z) it.next()).f39257a);
        }
        this.f39160c = Collections.unmodifiableSet(hashSet);
    }
}
