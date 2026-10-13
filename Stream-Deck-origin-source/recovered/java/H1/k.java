package H1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f3458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.i f3459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RemoteViews f3460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RemoteViews f3461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3462f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f3463g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RemoteViews f3465i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i8, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z8) {
            return builder.setGroupSummary(z8);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z8) {
            return builder.setLocalOnly(z8);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i8) {
            return builder.setColor(i8);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i8) {
            return builder.setVisibility(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z8) {
            return builder.setAllowGeneratedReplies(z8);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setBadgeIconType(i8);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z8) {
            return builder.setColorized(z8);
        }

        public static Notification.Builder d(Notification.Builder builder, int i8) {
            return builder.setGroupAlertBehavior(i8);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j8) {
            return builder.setTimeoutAfter(j8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i8) {
            return builder.setSemanticAction(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z8) {
            return builder.setAllowSystemGeneratedContextualActions(z8);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z8) {
            return builder.setContextual(z8);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z8) {
            return builder.setAuthenticationRequired(z8);
        }

        public static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setForegroundServiceBehavior(i8);
        }
    }

    public k(j.i iVar) {
        int i8;
        this.f3459c = iVar;
        Context context = iVar.f3405a;
        this.f3457a = context;
        Notification.Builder builderA = e.a(context, iVar.f3392L);
        this.f3458b = builderA;
        Notification notification = iVar.f3401U;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, iVar.f3413i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(iVar.f3409e).setContentText(iVar.f3410f).setContentInfo(iVar.f3415k).setContentIntent(iVar.f3411g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(iVar.f3412h, (notification.flags & 128) != 0).setNumber(iVar.f3416l).setProgress(iVar.f3425u, iVar.f3426v, iVar.f3427w);
        IconCompat iconCompat = iVar.f3414j;
        c.b(builderA, iconCompat == null ? null : iconCompat.v(context));
        builderA.setSubText(iVar.f3422r).setUsesChronometer(iVar.f3419o).setPriority(iVar.f3417m);
        j.n nVar = iVar.f3421q;
        if (nVar instanceof j.C0127j) {
            Iterator it = ((j.C0127j) nVar).o().iterator();
            while (it.hasNext()) {
                b((j.b) it.next());
            }
        } else {
            Iterator it2 = iVar.f3406b.iterator();
            while (it2.hasNext()) {
                b((j.b) it2.next());
            }
        }
        Bundle bundle = iVar.f3385E;
        if (bundle != null) {
            this.f3463g.putAll(bundle);
        }
        this.f3460d = iVar.f3389I;
        this.f3461e = iVar.f3390J;
        this.f3458b.setShowWhen(iVar.f3418n);
        a.i(this.f3458b, iVar.f3381A);
        a.g(this.f3458b, iVar.f3428x);
        a.j(this.f3458b, iVar.f3430z);
        a.h(this.f3458b, iVar.f3429y);
        this.f3464h = iVar.f3397Q;
        b.b(this.f3458b, iVar.f3384D);
        b.c(this.f3458b, iVar.f3386F);
        b.f(this.f3458b, iVar.f3387G);
        b.d(this.f3458b, iVar.f3388H);
        b.e(this.f3458b, notification.sound, notification.audioAttributes);
        ArrayList arrayList = iVar.f3404X;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b.a(this.f3458b, (String) it3.next());
            }
        }
        this.f3465i = iVar.f3391K;
        if (iVar.f3408d.size() > 0) {
            Bundle bundle2 = iVar.h().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i9 = 0; i9 < iVar.f3408d.size(); i9++) {
                bundle4.putBundle(Integer.toString(i9), l.e((j.b) iVar.f3408d.get(i9)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            iVar.h().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3463g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = iVar.f3403W;
        if (obj != null) {
            c.c(this.f3458b, obj);
        }
        this.f3458b.setExtras(iVar.f3385E);
        d.e(this.f3458b, iVar.f3424t);
        RemoteViews remoteViews = iVar.f3389I;
        if (remoteViews != null) {
            d.c(this.f3458b, remoteViews);
        }
        RemoteViews remoteViews2 = iVar.f3390J;
        if (remoteViews2 != null) {
            d.b(this.f3458b, remoteViews2);
        }
        RemoteViews remoteViews3 = iVar.f3391K;
        if (remoteViews3 != null) {
            d.d(this.f3458b, remoteViews3);
        }
        e.b(this.f3458b, iVar.f3393M);
        e.e(this.f3458b, iVar.f3423s);
        e.f(this.f3458b, iVar.f3394N);
        e.g(this.f3458b, iVar.f3396P);
        e.d(this.f3458b, iVar.f3397Q);
        if (iVar.f3383C) {
            e.c(this.f3458b, iVar.f3382B);
        }
        if (!TextUtils.isEmpty(iVar.f3392L)) {
            this.f3458b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it4 = iVar.f3407c.iterator();
        while (it4.hasNext()) {
            f.a(this.f3458b, ((p) it4.next()).i());
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            g.a(this.f3458b, iVar.f3399S);
            g.b(this.f3458b, j.h.k(iVar.f3400T));
            I1.b bVar = iVar.f3395O;
            if (bVar != null) {
                g.d(this.f3458b, bVar.b());
            }
        }
        if (i10 >= 31 && (i8 = iVar.f3398R) != 0) {
            h.b(this.f3458b, i8);
        }
        if (iVar.f3402V) {
            if (this.f3459c.f3429y) {
                this.f3464h = 2;
            } else {
                this.f3464h = 1;
            }
            this.f3458b.setVibrate(null);
            this.f3458b.setSound(null);
            int i11 = notification.defaults & (-4);
            notification.defaults = i11;
            this.f3458b.setDefaults(i11);
            if (TextUtils.isEmpty(this.f3459c.f3428x)) {
                a.g(this.f3458b, "silent");
            }
            e.d(this.f3458b, this.f3464h);
        }
    }

    @Override // H1.i
    public Notification.Builder a() {
        return this.f3458b;
    }

    public final void b(j.b bVar) {
        IconCompat iconCompatD = bVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.u() : null, bVar.h(), bVar.a());
        if (bVar.e() != null) {
            for (RemoteInput remoteInput : r.b(bVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = bVar.c() != null ? new Bundle(bVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i8 = Build.VERSION.SDK_INT;
        d.a(builderA, bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.f());
        f.b(builderA, bVar.f());
        if (i8 >= 29) {
            g.c(builderA, bVar.j());
        }
        if (i8 >= 31) {
            h.a(builderA, bVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.g());
        a.b(builderA, bundle);
        a.a(this.f3458b, a.d(builderA));
    }

    public Notification c() {
        Bundle bundleK;
        RemoteViews remoteViewsL;
        RemoteViews remoteViewsJ;
        j.n nVar = this.f3459c.f3421q;
        if (nVar != null) {
            nVar.b(this);
        }
        RemoteViews remoteViewsK = nVar != null ? nVar.k(this) : null;
        Notification notificationD = d();
        if (remoteViewsK != null) {
            notificationD.contentView = remoteViewsK;
        } else {
            RemoteViews remoteViews = this.f3459c.f3389I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (nVar != null && (remoteViewsJ = nVar.j(this)) != null) {
            notificationD.bigContentView = remoteViewsJ;
        }
        if (nVar != null && (remoteViewsL = this.f3459c.f3421q.l(this)) != null) {
            notificationD.headsUpContentView = remoteViewsL;
        }
        if (nVar != null && (bundleK = j.k(notificationD)) != null) {
            nVar.a(bundleK);
        }
        return notificationD;
    }

    public Notification d() {
        return this.f3458b.build();
    }

    public Context e() {
        return this.f3457a;
    }
}
