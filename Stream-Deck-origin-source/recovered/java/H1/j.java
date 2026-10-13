package H1;

import T0.Vl.PCRzgdeK;
import Z.JTT.ryTuoS;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f3339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f3340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r[] f3341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r[] f3342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f3344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f3345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f3346h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3347i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f3348j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f3349k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f3350l;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconCompat f3351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CharSequence f3352b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PendingIntent f3353c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f3354d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bundle f3355e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public ArrayList f3356f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f3357g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f3358h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f3359i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f3360j;

            /* JADX INFO: renamed from: H1.j$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class C0125a {
                public static Bundle a(Notification.Action action) {
                    return action.getExtras();
                }

                public static RemoteInput[] b(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* JADX INFO: renamed from: H1.j$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class C0126b {
                public static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class c {
                public static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class d {
                public static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class e {
                public static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class f {
                public static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public static a e(Notification.Action action) {
                a aVar = C0126b.a(action) != null ? new a(IconCompat.c(C0126b.a(action)), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputArrB = C0125a.b(action);
                if (remoteInputArrB != null && remoteInputArrB.length != 0) {
                    for (RemoteInput remoteInput : remoteInputArrB) {
                        aVar.b(r.c(remoteInput));
                    }
                }
                int i8 = Build.VERSION.SDK_INT;
                aVar.f3354d = c.a(action);
                aVar.h(d.a(action));
                if (i8 >= 29) {
                    aVar.g(e.a(action));
                }
                if (i8 >= 31) {
                    aVar.f(f.a(action));
                }
                aVar.a(C0125a.a(action));
                return aVar;
            }

            public a a(Bundle bundle) {
                if (bundle != null) {
                    this.f3355e.putAll(bundle);
                }
                return this;
            }

            public a b(r rVar) {
                if (this.f3356f == null) {
                    this.f3356f = new ArrayList();
                }
                if (rVar != null) {
                    this.f3356f.add(rVar);
                }
                return this;
            }

            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<r> arrayList3 = this.f3356f;
                if (arrayList3 != null) {
                    for (r rVar : arrayList3) {
                        if (rVar.k()) {
                            arrayList.add(rVar);
                        } else {
                            arrayList2.add(rVar);
                        }
                    }
                }
                return new b(this.f3351a, this.f3352b, this.f3353c, this.f3355e, arrayList2.isEmpty() ? null : (r[]) arrayList2.toArray(new r[arrayList2.size()]), arrayList.isEmpty() ? null : (r[]) arrayList.toArray(new r[arrayList.size()]), this.f3354d, this.f3357g, this.f3358h, this.f3359i, this.f3360j);
            }

            public final void d() {
                if (this.f3359i && this.f3353c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a f(boolean z8) {
                this.f3360j = z8;
                return this;
            }

            public a g(boolean z8) {
                this.f3359i = z8;
                return this;
            }

            public a h(int i8) {
                this.f3357g = i8;
                return this;
            }

            public a(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i8 != 0 ? IconCompat.k(null, "", i8) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(b bVar) {
                this(bVar.d(), bVar.f3348j, bVar.f3349k, new Bundle(bVar.f3339a), bVar.e(), bVar.b(), bVar.f(), bVar.f3344f, bVar.j(), bVar.i());
            }

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, boolean z8, int i8, boolean z9, boolean z10, boolean z11) {
                this.f3354d = true;
                this.f3358h = true;
                this.f3351a = iconCompat;
                this.f3352b = i.j(charSequence);
                this.f3353c = pendingIntent;
                this.f3355e = bundle;
                this.f3356f = rVarArr == null ? null : new ArrayList(Arrays.asList(rVarArr));
                this.f3354d = z8;
                this.f3357g = i8;
                this.f3358h = z9;
                this.f3359i = z10;
                this.f3360j = z11;
            }
        }

        public b(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i8 != 0 ? IconCompat.k(null, "", i8) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f3349k;
        }

        public boolean b() {
            return this.f3343e;
        }

        public Bundle c() {
            return this.f3339a;
        }

        public IconCompat d() {
            int i8;
            if (this.f3340b == null && (i8 = this.f3347i) != 0) {
                this.f3340b = IconCompat.k(null, "", i8);
            }
            return this.f3340b;
        }

        public r[] e() {
            return this.f3341c;
        }

        public int f() {
            return this.f3345g;
        }

        public boolean g() {
            return this.f3344f;
        }

        public CharSequence h() {
            return this.f3348j;
        }

        public boolean i() {
            return this.f3350l;
        }

        public boolean j() {
            return this.f3346h;
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (r[]) null, (r[]) null, true, 0, true, false, false);
        }

        public b(int i8, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z8, int i9, boolean z9, boolean z10, boolean z11) {
            this(i8 != 0 ? IconCompat.k(null, "", i8) : null, charSequence, pendingIntent, bundle, rVarArr, rVarArr2, z8, i9, z9, z10, z11);
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z8, int i8, boolean z9, boolean z10, boolean z11) {
            this.f3344f = true;
            this.f3340b = iconCompat;
            if (iconCompat != null && iconCompat.o() == 2) {
                this.f3347i = iconCompat.m();
            }
            this.f3348j = i.j(charSequence);
            this.f3349k = pendingIntent;
            this.f3339a = bundle == null ? new Bundle() : bundle;
            this.f3341c = rVarArr;
            this.f3342d = rVarArr2;
            this.f3343e = z8;
            this.f3345g = i8;
            this.f3344f = z9;
            this.f3346h = z10;
            this.f3350l = z11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static boolean a(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        public static CharSequence[] b(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        public static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        public static Bundle d(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        public static String e(Notification notification) {
            return notification.getGroup();
        }

        public static CharSequence f(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        public static RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        public static String h(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        public static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {
        public static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        public static String b(Notification notification) {
            return notification.getChannelId();
        }

        public static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        public static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        public static String e(Notification notification) {
            return notification.getShortcutId();
        }

        public static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {
        public static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        public static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        public static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        public static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        public static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class f extends n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public IconCompat f3361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IconCompat f3362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f3364h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f3365i;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z8) {
                bigPictureStyle.showBigPictureWhenCollapsed(z8);
            }
        }

        public f() {
        }

        public static IconCompat o(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.b((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.g((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat p(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? o(parcelable) : o(bundle.getParcelable("android.pictureIcon"));
        }

        @Override // H1.j.n
        public void b(H1.i iVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(iVar.a()).setBigContentTitle(this.f3454b);
            IconCompat iconCompat = this.f3361e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f3361e.v(iVar instanceof H1.k ? ((H1.k) iVar).e() : null));
                } else if (iconCompat.o() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f3361e.l());
                }
            }
            if (this.f3363g) {
                if (this.f3362f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f3362f.v(iVar instanceof H1.k ? ((H1.k) iVar).e() : null));
                }
            }
            if (this.f3456d) {
                bigContentTitle.setSummaryText(this.f3455c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f3365i);
                b.b(bigContentTitle, this.f3364h);
            }
        }

        @Override // H1.j.n
        public void c(Bundle bundle) {
            super.c(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.pictureIcon");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        @Override // H1.j.n
        public String i() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // H1.j.n
        public void m(Bundle bundle) {
            super.m(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f3362f = o(bundle.getParcelable("android.largeIcon.big"));
                this.f3363g = true;
            }
            this.f3361e = p(bundle);
            this.f3365i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public f(i iVar) {
            n(iVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g extends n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f3366e;

        public g() {
        }

        @Override // H1.j.n
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // H1.j.n
        public void b(H1.i iVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f3454b).bigText(this.f3366e);
            if (this.f3456d) {
                bigTextStyleBigText.setSummaryText(this.f3455c);
            }
        }

        @Override // H1.j.n
        public void c(Bundle bundle) {
            super.c(bundle);
            bundle.remove("android.bigText");
        }

        @Override // H1.j.n
        public void m(Bundle bundle) {
            super.m(bundle);
            this.f3366e = bundle.getCharSequence("android.bigText");
        }

        public g o(CharSequence charSequence) {
            this.f3366e = i.j(charSequence);
            return this;
        }

        public g(i iVar) {
            n(iVar);
        }

        @Override // H1.j.n
        public String i() {
            return PCRzgdeK.zWSzGGrdBBvaV;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PendingIntent f3367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PendingIntent f3368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public IconCompat f3369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f3373g;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {
            public static h a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c cVarG = new c(bubbleMetadata.getIntent(), IconCompat.b(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVarG.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVarG.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVarG.a();
            }

            public static Notification.BubbleMetadata b(h hVar) {
                if (hVar == null || hVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(hVar.f().u()).setIntent(hVar.g()).setDeleteIntent(hVar.c()).setAutoExpandBubble(hVar.b()).setSuppressNotification(hVar.i());
                if (hVar.d() != 0) {
                    suppressNotification.setDesiredHeight(hVar.d());
                }
                if (hVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(hVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class b {
            public static h a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.b(bubbleMetadata.getIcon()));
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            public static Notification.BubbleMetadata b(h hVar) {
                if (hVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = hVar.h() != null ? new Notification.BubbleMetadata.Builder(hVar.h()) : new Notification.BubbleMetadata.Builder(hVar.g(), hVar.f().u());
                builder.setDeleteIntent(hVar.c()).setAutoExpandBubble(hVar.b()).setSuppressNotification(hVar.i());
                if (hVar.d() != 0) {
                    builder.setDesiredHeight(hVar.d());
                }
                if (hVar.e() != 0) {
                    builder.setDesiredHeightResId(hVar.e());
                }
                return builder.build();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public PendingIntent f3374a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IconCompat f3375b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f3376c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f3377d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f3378e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public PendingIntent f3379f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public String f3380g;

            @Deprecated
            public c() {
            }

            public c b(boolean z8) {
                f(1, z8);
                return this;
            }

            public c c(PendingIntent pendingIntent) {
                this.f3379f = pendingIntent;
                return this;
            }

            public c d(int i8) {
                this.f3376c = Math.max(i8, 0);
                this.f3377d = 0;
                return this;
            }

            public c e(int i8) {
                this.f3377d = i8;
                this.f3376c = 0;
                return this;
            }

            public final c f(int i8, boolean z8) {
                if (z8) {
                    this.f3378e = i8 | this.f3378e;
                    return this;
                }
                this.f3378e = (~i8) & this.f3378e;
                return this;
            }

            public c g(boolean z8) {
                f(2, z8);
                return this;
            }

            public c(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f3380g = str;
            }

            public h a() {
                String str = this.f3380g;
                if (str == null && this.f3374a == null) {
                    throw new NullPointerException(ryTuoS.Epbjbxf);
                }
                if (str == null && this.f3375b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                h hVar = new h(this.f3374a, this.f3379f, this.f3375b, this.f3376c, this.f3377d, this.f3378e, str);
                hVar.j(this.f3378e);
                return hVar;
            }

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f3374a = pendingIntent;
                    this.f3375b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        public static h a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i8 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        public static Notification.BubbleMetadata k(h hVar) {
            if (hVar == null) {
                return null;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                return b.b(hVar);
            }
            if (i8 == 29) {
                return a.b(hVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f3372f & 1) != 0;
        }

        public PendingIntent c() {
            return this.f3368b;
        }

        public int d() {
            return this.f3370d;
        }

        public int e() {
            return this.f3371e;
        }

        public IconCompat f() {
            return this.f3369c;
        }

        public PendingIntent g() {
            return this.f3367a;
        }

        public String h() {
            return this.f3373g;
        }

        public boolean i() {
            return (this.f3372f & 2) != 0;
        }

        public void j(int i8) {
            this.f3372f = i8;
        }

        public h(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i8, int i9, int i10, String str) {
            this.f3367a = pendingIntent;
            this.f3369c = iconCompat;
            this.f3370d = i8;
            this.f3371e = i9;
            this.f3368b = pendingIntent2;
            this.f3372f = i10;
            this.f3373g = str;
        }
    }

    /* JADX INFO: renamed from: H1.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0127j extends n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p f3432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f3433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f3434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PendingIntent f3435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Integer f3437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f3438l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public IconCompat f3439m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f3440n;

        /* JADX INFO: renamed from: H1.j$j$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: renamed from: H1.j$j$d */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class d {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i8) {
                return callStyle.setAnswerButtonColorHint(i8);
            }

            public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z8) {
                return builder.setAuthenticationRequired(z8);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, int i8) {
                return callStyle.setDeclineButtonColorHint(i8);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z8) {
                return callStyle.setIsVideo(z8);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public C0127j() {
        }

        @Override // H1.j.n
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f3431e);
            bundle.putBoolean("android.callIsVideo", this.f3436j);
            p pVar = this.f3432f;
            if (pVar != null) {
                bundle.putParcelable("android.callPerson", c.b(pVar.i()));
            }
            IconCompat iconCompat = this.f3439m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.v(this.f3453a.f3405a)));
            }
            bundle.putCharSequence("android.verificationText", this.f3440n);
            bundle.putParcelable("android.answerIntent", this.f3433g);
            bundle.putParcelable("android.declineIntent", this.f3434h);
            bundle.putParcelable("android.hangUpIntent", this.f3435i);
            Integer num = this.f3437k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f3438l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // H1.j.n
        public void b(H1.i iVar) {
            CharSequence charSequenceP = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceP = null;
            if (Build.VERSION.SDK_INT < 31) {
                Notification.Builder builderA = iVar.a();
                p pVar = this.f3432f;
                builderA.setContentTitle(pVar != null ? pVar.e() : null);
                Bundle bundle = this.f3453a.f3385E;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceP = this.f3453a.f3385E.getCharSequence("android.text");
                }
                if (charSequenceP == null) {
                    charSequenceP = p();
                }
                builderA.setContentText(charSequenceP);
                p pVar2 = this.f3432f;
                if (pVar2 != null) {
                    if (pVar2.c() != null) {
                        b.c(builderA, this.f3432f.c().v(this.f3453a.f3405a));
                    }
                    c.a(builderA, this.f3432f.i());
                }
                a.b(builderA, "call");
                return;
            }
            int i8 = this.f3431e;
            if (i8 == 1) {
                callStyleA = d.a(this.f3432f.i(), this.f3434h, this.f3433g);
            } else if (i8 == 2) {
                callStyleA = d.b(this.f3432f.i(), this.f3435i);
            } else if (i8 == 3) {
                callStyleA = d.c(this.f3432f.i(), this.f3435i, this.f3433g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f3431e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(iVar.a());
                Integer num = this.f3437k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f3438l;
                if (num2 != null) {
                    d.f(callStyleA, num2.intValue());
                }
                d.i(callStyleA, this.f3440n);
                IconCompat iconCompat = this.f3439m;
                if (iconCompat != null) {
                    d.h(callStyleA, iconCompat.v(this.f3453a.f3405a));
                }
                d.g(callStyleA, this.f3436j);
            }
        }

        @Override // H1.j.n
        public String i() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // H1.j.n
        public void m(Bundle bundle) {
            super.m(bundle);
            this.f3431e = bundle.getInt("android.callType");
            this.f3436j = bundle.getBoolean("android.callIsVideo");
            if (bundle.containsKey("android.callPerson")) {
                this.f3432f = p.a((Person) bundle.getParcelable("android.callPerson"));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.f3432f = p.b(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.f3439m = IconCompat.b((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.f3439m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
            }
            this.f3440n = bundle.getCharSequence("android.verificationText");
            this.f3433g = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.f3434h = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.f3435i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            this.f3437k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
            this.f3438l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
        }

        public ArrayList o() {
            b bVarT = t();
            b bVarS = s();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bVarT);
            ArrayList<b> arrayList2 = this.f3453a.f3406b;
            int i8 = 2;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.j()) {
                        arrayList.add(bVar);
                    } else if (!q(bVar) && i8 > 1) {
                        arrayList.add(bVar);
                        i8--;
                    }
                    if (bVarS != null && i8 == 1) {
                        arrayList.add(bVarS);
                        i8--;
                    }
                }
            }
            if (bVarS != null && i8 >= 1) {
                arrayList.add(bVarS);
            }
            return arrayList;
        }

        public final String p() {
            int i8 = this.f3431e;
            if (i8 == 1) {
                return this.f3453a.f3405a.getResources().getString(G1.e.f2660e);
            }
            if (i8 == 2) {
                return this.f3453a.f3405a.getResources().getString(G1.e.f2661f);
            }
            if (i8 != 3) {
                return null;
            }
            return this.f3453a.f3405a.getResources().getString(G1.e.f2662g);
        }

        public final boolean q(b bVar) {
            return bVar != null && bVar.c().getBoolean("key_action_priority");
        }

        public final b r(int i8, int i9, Integer num, int i10, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(I1.a.b(this.f3453a.f3405a, i10));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f3453a.f3405a.getResources().getString(i9));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b bVarC = new b.a(IconCompat.j(this.f3453a.f3405a, i8), spannableStringBuilder, pendingIntent).c();
            bVarC.c().putBoolean("key_action_priority", true);
            return bVarC;
        }

        public final b s() {
            int i8 = G1.c.f2610b;
            int i9 = G1.c.f2609a;
            PendingIntent pendingIntent = this.f3433g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z8 = this.f3436j;
            return r(z8 ? i8 : i9, z8 ? G1.e.f2657b : G1.e.f2656a, this.f3437k, G1.b.f2607a, pendingIntent);
        }

        public final b t() {
            int i8 = G1.c.f2611c;
            PendingIntent pendingIntent = this.f3434h;
            return pendingIntent == null ? r(i8, G1.e.f2659d, this.f3438l, G1.b.f2608b, this.f3435i) : r(i8, G1.e.f2658c, this.f3438l, G1.b.f2608b, pendingIntent);
        }

        public C0127j(i iVar) {
            n(iVar);
        }

        /* JADX INFO: renamed from: H1.j$j$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class b {
            public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            public static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            public static Parcelable a(Icon icon) {
                return icon;
            }
        }

        /* JADX INFO: renamed from: H1.j$j$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class c {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class k extends n {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // H1.j.n
        public void b(H1.i iVar) {
            iVar.a().setStyle(a.a());
        }

        @Override // H1.j.n
        public String i() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // H1.j.n
        public RemoteViews j(H1.i iVar) {
            return null;
        }

        @Override // H1.j.n
        public RemoteViews k(H1.i iVar) {
            return null;
        }

        @Override // H1.j.n
        public RemoteViews l(H1.i iVar) {
            return null;
        }
    }

    @Deprecated
    public j() {
    }

    public static int A(Notification notification) {
        return notification.visibility;
    }

    public static boolean B(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static Bitmap C(Context context, Bitmap bitmap) {
        return bitmap;
    }

    public static boolean a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.a(notification);
        }
        return false;
    }

    public static boolean b(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int c(Notification notification) {
        return d.a(notification);
    }

    public static h d(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(e.b(notification));
        }
        return null;
    }

    public static String e(Notification notification) {
        return notification.category;
    }

    public static String f(Notification notification) {
        return d.b(notification);
    }

    public static int g(Notification notification) {
        return notification.color;
    }

    public static CharSequence h(Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    public static CharSequence i(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    public static Bundle k(Notification notification) {
        return notification.extras;
    }

    public static String l(Notification notification) {
        return c.e(notification);
    }

    public static boolean m(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static List n(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i8 = 0; i8 < bundle.size(); i8++) {
                arrayList.add(H1.l.c(bundle.getBundle(Integer.toString(i8))));
            }
        }
        return arrayList;
    }

    public static boolean o(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static I1.b p(Notification notification) {
        LocusId locusIdD;
        if (Build.VERSION.SDK_INT < 29 || (locusIdD = e.d(notification)) == null) {
            return null;
        }
        return I1.b.c(locusIdD);
    }

    public static boolean q(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean r(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static Notification s(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence t(Notification notification) {
        return d.d(notification);
    }

    public static String u(Notification notification) {
        return d.e(notification);
    }

    public static boolean v(Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }

    public static String w(Notification notification) {
        return c.i(notification);
    }

    public static CharSequence x(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static long y(Notification notification) {
        return d.f(notification);
    }

    public static boolean z(Notification notification) {
        return notification.extras.getBoolean("android.showChronometer");
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class l extends n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f3441e = new ArrayList();

        public l() {
        }

        @Override // H1.j.n
        public void b(H1.i iVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(iVar.a()).setBigContentTitle(this.f3454b);
            if (this.f3456d) {
                bigContentTitle.setSummaryText(this.f3455c);
            }
            Iterator it = this.f3441e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // H1.j.n
        public void c(Bundle bundle) {
            super.c(bundle);
            bundle.remove("android.textLines");
        }

        @Override // H1.j.n
        public String i() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // H1.j.n
        public void m(Bundle bundle) {
            super.m(bundle);
            this.f3441e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f3441e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public l(i iVar) {
            n(iVar);
        }
    }

    public static CharSequence j(Notification notification) {
        return notification.extras.getCharSequence(uYOhHhTXuF.feZADDXhlRf);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class m extends n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f3442e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f3443f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f3444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f3445h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f3446i;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class b {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class c {
            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z8) {
                return messagingStyle.setGroupConversation(z8);
            }
        }

        public m() {
        }

        @Override // H1.j.n
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f3444g.e());
            bundle.putBundle("android.messagingStyleUser", this.f3444g.j());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f3445h);
            if (this.f3445h != null && this.f3446i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f3445h);
            }
            if (!this.f3442e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f3442e));
            }
            if (!this.f3443f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f3443f));
            }
            Boolean bool = this.f3446i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // H1.j.n
        public void b(H1.i iVar) {
            p(o());
            Notification.MessagingStyle messagingStyleA = c.a(this.f3444g.i());
            Iterator it = this.f3442e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleA, ((d) it.next()).k());
            }
            Iterator it2 = this.f3443f.iterator();
            while (it2.hasNext()) {
                b.a(messagingStyleA, ((d) it2.next()).k());
            }
            this.f3446i.booleanValue();
            a.c(messagingStyleA, this.f3445h);
            c.b(messagingStyleA, this.f3446i.booleanValue());
            messagingStyleA.setBuilder(iVar.a());
        }

        @Override // H1.j.n
        public void c(Bundle bundle) {
            super.c(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }

        @Override // H1.j.n
        public String i() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // H1.j.n
        public void m(Bundle bundle) {
            super.m(bundle);
            this.f3442e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f3444g = p.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f3444g = new p.b().f(bundle.getString("android.selfDisplayName")).a();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f3445h = charSequence;
            if (charSequence == null) {
                this.f3445h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f3442e.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f3443f.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f3446i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public boolean o() {
            i iVar = this.f3453a;
            if (iVar != null && iVar.f3405a.getApplicationInfo().targetSdkVersion < 28 && this.f3446i == null) {
                return this.f3445h != null;
            }
            Boolean bool = this.f3446i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public m p(boolean z8) {
            this.f3446i = Boolean.valueOf(z8);
            return this;
        }

        @Deprecated
        public m(CharSequence charSequence) {
            this.f3444g = new p.b().f(charSequence).a();
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CharSequence f3447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f3448b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final p f3449c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Bundle f3450d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f3451e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Uri f3452f;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class a {
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j8, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j8, charSequence2);
                }

                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public d(CharSequence charSequence, long j8, p pVar) {
                this.f3450d = new Bundle();
                this.f3447a = charSequence;
                this.f3448b = j8;
                this.f3449c = pVar;
            }

            public static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    bundleArr[i8] = ((d) list.get(i8)).l();
                }
                return bundleArr;
            }

            public static d e(Bundle bundle) {
                p pVarA;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey(com.amazon.a.a.h.a.f16436b)) {
                        if (bundle.containsKey("person")) {
                            pVarA = p.b(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person")) {
                            pVarA = p.a((Person) bundle.getParcelable("sender_person"));
                        } else {
                            pVarA = bundle.containsKey("sender") ? new p.b().f(bundle.getCharSequence("sender")).a() : null;
                        }
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong(com.amazon.a.a.h.a.f16436b), pVarA);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            dVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public static List f(Parcelable[] parcelableArr) {
                d dVarE;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (dVarE = e((Bundle) parcelable)) != null) {
                        arrayList.add(dVarE);
                    }
                }
                return arrayList;
            }

            public String b() {
                return this.f3451e;
            }

            public Uri c() {
                return this.f3452f;
            }

            public Bundle d() {
                return this.f3450d;
            }

            public p g() {
                return this.f3449c;
            }

            public CharSequence h() {
                return this.f3447a;
            }

            public long i() {
                return this.f3448b;
            }

            public d j(String str, Uri uri) {
                this.f3451e = str;
                this.f3452f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message k() {
                p pVarG = g();
                Notification.MessagingStyle.Message messageB = b.b(h(), i(), pVarG == null ? null : pVarG.i());
                if (b() != null) {
                    a.b(messageB, b(), c());
                }
                return messageB;
            }

            public final Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f3447a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(com.amazon.a.a.h.a.f16436b, this.f3448b);
                p pVar = this.f3449c;
                if (pVar != null) {
                    bundle.putCharSequence("sender", pVar.e());
                    bundle.putParcelable("sender_person", b.a(this.f3449c.i()));
                }
                String str = this.f3451e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f3452f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f3450d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Deprecated
            public d(CharSequence charSequence, long j8, CharSequence charSequence2) {
                this(charSequence, j8, new p.b().f(charSequence2).a());
            }

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static class b {
                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j8, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j8, person);
                }

                public static Parcelable a(Person person) {
                    return person;
                }
            }
        }

        public m(p pVar) {
            if (!TextUtils.isEmpty(pVar.e())) {
                this.f3444g = pVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f3453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f3454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f3455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3456d = false;

        public static n d(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new k();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new f();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new C0127j();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new l();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new g();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new m();
                default:
                    return null;
            }
        }

        public static n e(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new f();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new g();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new m();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new k();
            }
            return null;
        }

        public static n f(Bundle bundle) {
            n nVarD = d(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if (nVarD != null) {
                return nVarD;
            }
            if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                return new m();
            }
            if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
                return new f();
            }
            if (bundle.containsKey("android.bigText")) {
                return new g();
            }
            if (bundle.containsKey("android.textLines")) {
                return new l();
            }
            return bundle.containsKey("android.callType") ? new C0127j() : e(bundle.getString("android.template"));
        }

        public static n g(Bundle bundle) {
            n nVarF = f(bundle);
            if (nVarF == null) {
                return null;
            }
            try {
                nVarF.m(bundle);
                return nVarF;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        public static n h(Notification notification) {
            Bundle bundleK = j.k(notification);
            if (bundleK == null) {
                return null;
            }
            return g(bundleK);
        }

        public void a(Bundle bundle) {
            if (this.f3456d) {
                bundle.putCharSequence("android.summaryText", this.f3455c);
            }
            CharSequence charSequence = this.f3454b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strI = i();
            if (strI != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strI);
            }
        }

        public void c(Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        public String i() {
            return null;
        }

        public RemoteViews j(H1.i iVar) {
            return null;
        }

        public RemoteViews k(H1.i iVar) {
            return null;
        }

        public RemoteViews l(H1.i iVar) {
            return null;
        }

        public void m(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f3455c = bundle.getCharSequence("android.summaryText");
                this.f3456d = true;
            }
            this.f3454b = bundle.getCharSequence("android.title.big");
        }

        public void n(i iVar) {
            if (this.f3453a != iVar) {
                this.f3453a = iVar;
                if (iVar != null) {
                    iVar.U(this);
                }
            }
        }

        public void b(H1.i iVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class i {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f3381A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f3382B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public boolean f3383C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public String f3384D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public Bundle f3385E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f3386F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f3387G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public Notification f3388H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public RemoteViews f3389I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public RemoteViews f3390J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public RemoteViews f3391K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f3392L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f3393M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public String f3394N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public I1.b f3395O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public long f3396P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f3397Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f3398R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public boolean f3399S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public h f3400T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public Notification f3401U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public boolean f3402V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public Object f3403W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public ArrayList f3404X;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f3405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f3406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f3407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f3408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f3409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f3410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f3411g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f3412h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public RemoteViews f3413i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public IconCompat f3414j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f3415k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f3416l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f3417m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f3418n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f3419o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f3420p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public n f3421q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public CharSequence f3422r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence f3423s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public CharSequence[] f3424t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f3425u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f3426v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f3427w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f3428x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f3429y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f3430z;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i8) {
                return builder.setContentType(i8);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i8) {
                return builder.setLegacyStreamType(i8);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i8) {
                return builder.setUsage(i8);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class b {
            public static Icon a(Notification notification) {
                return notification.getLargeIcon();
            }

            public static Icon b(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        public i(Context context, Notification notification) {
            this(context, j.f(notification));
            Bundle bundle = notification.extras;
            n nVarH = n.h(notification);
            w(j.j(notification)).v(j.i(notification)).t(j.h(notification)).V(j.x(notification)).N(j.t(notification)).U(nVarH).B(j.l(notification)).C(j.B(notification)).G(j.p(notification)).b0(notification.when).P(j.v(notification)).Y(j.z(notification)).l(j.b(notification)).J(j.r(notification)).I(j.q(notification)).F(j.o(notification)).D(notification.largeIcon).m(j.c(notification)).o(j.e(notification)).n(j.d(notification)).H(notification.number).W(notification.tickerText).u(notification.contentIntent).y(notification.deleteIntent).A(notification.fullScreenIntent, j.m(notification)).T(notification.sound, notification.audioStreamType).Z(notification.vibrate).E(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).x(notification.defaults).K(notification.priority).r(j.g(notification)).a0(j.A(notification)).M(j.s(notification)).S(j.w(notification)).X(j.y(notification)).O(j.u(notification)).L(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean("android.progressIndeterminate")).k(j.a(notification)).R(notification.icon, notification.iconLevel).c(i(notification, nVarH));
            this.f3403W = b.b(notification);
            Icon iconA = b.a(notification);
            if (iconA != null) {
                this.f3414j = IconCompat.b(iconA);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.e(action).c());
                }
            }
            List listN = j.n(notification);
            if (!listN.isEmpty()) {
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    d((b) it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    f(str);
                }
            }
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    e(p.a((Person) it2.next()));
                }
            }
            if (bundle.containsKey("android.chronometerCountDown")) {
                q(bundle.getBoolean("android.chronometerCountDown"));
            }
            if (bundle.containsKey("android.colorized")) {
                s(bundle.getBoolean("android.colorized"));
            }
        }

        public static Bundle i(Notification notification, n nVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (nVar != null) {
                nVar.c(bundle);
            }
            return bundle;
        }

        public static CharSequence j(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public i A(PendingIntent pendingIntent, boolean z8) {
            this.f3412h = pendingIntent;
            z(128, z8);
            return this;
        }

        public i B(String str) {
            this.f3428x = str;
            return this;
        }

        public i C(boolean z8) {
            this.f3429y = z8;
            return this;
        }

        public i D(Bitmap bitmap) {
            this.f3414j = bitmap == null ? null : IconCompat.g(j.C(this.f3405a, bitmap));
            return this;
        }

        public i E(int i8, int i9, int i10) {
            Notification notification = this.f3401U;
            notification.ledARGB = i8;
            notification.ledOnMS = i9;
            notification.ledOffMS = i10;
            notification.flags = ((i9 == 0 || i10 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public i F(boolean z8) {
            this.f3381A = z8;
            return this;
        }

        public i G(I1.b bVar) {
            this.f3395O = bVar;
            return this;
        }

        public i H(int i8) {
            this.f3416l = i8;
            return this;
        }

        public i I(boolean z8) {
            z(2, z8);
            return this;
        }

        public i J(boolean z8) {
            z(8, z8);
            return this;
        }

        public i K(int i8) {
            this.f3417m = i8;
            return this;
        }

        public i L(int i8, int i9, boolean z8) {
            this.f3425u = i8;
            this.f3426v = i9;
            this.f3427w = z8;
            return this;
        }

        public i M(Notification notification) {
            this.f3388H = notification;
            return this;
        }

        public i N(CharSequence charSequence) {
            this.f3423s = j(charSequence);
            return this;
        }

        public i O(String str) {
            this.f3394N = str;
            return this;
        }

        public i P(boolean z8) {
            this.f3418n = z8;
            return this;
        }

        public i Q(int i8) {
            this.f3401U.icon = i8;
            return this;
        }

        public i R(int i8, int i9) {
            Notification notification = this.f3401U;
            notification.icon = i8;
            notification.iconLevel = i9;
            return this;
        }

        public i S(String str) {
            this.f3430z = str;
            return this;
        }

        public i T(Uri uri, int i8) {
            Notification notification = this.f3401U;
            notification.sound = uri;
            notification.audioStreamType = i8;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), i8);
            this.f3401U.audioAttributes = a.a(builderD);
            return this;
        }

        public i U(n nVar) {
            if (this.f3421q != nVar) {
                this.f3421q = nVar;
                if (nVar != null) {
                    nVar.n(this);
                }
            }
            return this;
        }

        public i V(CharSequence charSequence) {
            this.f3422r = j(charSequence);
            return this;
        }

        public i W(CharSequence charSequence) {
            this.f3401U.tickerText = j(charSequence);
            return this;
        }

        public i X(long j8) {
            this.f3396P = j8;
            return this;
        }

        public i Y(boolean z8) {
            this.f3419o = z8;
            return this;
        }

        public i Z(long[] jArr) {
            this.f3401U.vibrate = jArr;
            return this;
        }

        public i a(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3406b.add(new b(i8, charSequence, pendingIntent));
            return this;
        }

        public i a0(int i8) {
            this.f3387G = i8;
            return this;
        }

        public i b(b bVar) {
            if (bVar != null) {
                this.f3406b.add(bVar);
            }
            return this;
        }

        public i b0(long j8) {
            this.f3401U.when = j8;
            return this;
        }

        public i c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f3385E;
                if (bundle2 == null) {
                    this.f3385E = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public i d(b bVar) {
            if (bVar != null) {
                this.f3408d.add(bVar);
            }
            return this;
        }

        public i e(p pVar) {
            if (pVar != null) {
                this.f3407c.add(pVar);
            }
            return this;
        }

        public i f(String str) {
            if (str != null && !str.isEmpty()) {
                this.f3404X.add(str);
            }
            return this;
        }

        public Notification g() {
            return new H1.k(this).c();
        }

        public Bundle h() {
            if (this.f3385E == null) {
                this.f3385E = new Bundle();
            }
            return this.f3385E;
        }

        public i k(boolean z8) {
            this.f3399S = z8;
            return this;
        }

        public i l(boolean z8) {
            z(16, z8);
            return this;
        }

        public i m(int i8) {
            this.f3393M = i8;
            return this;
        }

        public i n(h hVar) {
            this.f3400T = hVar;
            return this;
        }

        public i o(String str) {
            this.f3384D = str;
            return this;
        }

        public i p(String str) {
            this.f3392L = str;
            return this;
        }

        public i q(boolean z8) {
            this.f3420p = z8;
            h().putBoolean("android.chronometerCountDown", z8);
            return this;
        }

        public i r(int i8) {
            this.f3386F = i8;
            return this;
        }

        public i s(boolean z8) {
            this.f3382B = z8;
            this.f3383C = true;
            return this;
        }

        public i t(CharSequence charSequence) {
            this.f3415k = j(charSequence);
            return this;
        }

        public i u(PendingIntent pendingIntent) {
            this.f3411g = pendingIntent;
            return this;
        }

        public i v(CharSequence charSequence) {
            this.f3410f = j(charSequence);
            return this;
        }

        public i w(CharSequence charSequence) {
            this.f3409e = j(charSequence);
            return this;
        }

        public i x(int i8) {
            Notification notification = this.f3401U;
            notification.defaults = i8;
            if ((i8 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public i y(PendingIntent pendingIntent) {
            this.f3401U.deleteIntent = pendingIntent;
            return this;
        }

        public final void z(int i8, boolean z8) {
            if (z8) {
                Notification notification = this.f3401U;
                notification.flags = i8 | notification.flags;
            } else {
                Notification notification2 = this.f3401U;
                notification2.flags = (~i8) & notification2.flags;
            }
        }

        public i(Context context, String str) {
            this.f3406b = new ArrayList();
            this.f3407c = new ArrayList();
            this.f3408d = new ArrayList();
            this.f3418n = true;
            this.f3381A = false;
            this.f3386F = 0;
            this.f3387G = 0;
            this.f3393M = 0;
            this.f3397Q = 0;
            this.f3398R = 0;
            Notification notification = new Notification();
            this.f3401U = notification;
            this.f3405a = context;
            this.f3392L = str;
            notification.when = System.currentTimeMillis();
            this.f3401U.audioStreamType = -1;
            this.f3417m = 0;
            this.f3404X = new ArrayList();
            this.f3399S = true;
        }

        @Deprecated
        public i(Context context) {
            this(context, (String) null);
        }
    }
}
