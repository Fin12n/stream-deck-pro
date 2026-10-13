package p036e;

import T0.Vl.PCRzgdeK;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f19989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f19990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f19988e = new c(null);
    public static final Parcelable.Creator<g> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentSender f19993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f19994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19996d;

        public a(IntentSender intentSender) {
            t.g(intentSender, "intentSender");
            this.f19993a = intentSender;
        }

        public final g a() {
            return new g(this.f19993a, this.f19994b, this.f19995c, this.f19996d);
        }

        public final a b(Intent intent) {
            this.f19994b = intent;
            return this;
        }

        public final a c(int i8, int i9) {
            this.f19996d = i8;
            this.f19995c = i9;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            t.g(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            t.f(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i8) {
            return new g[i8];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            t.g(parcel, PCRzgdeK.VRazCILHA);
            return new g(parcel);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    public g(IntentSender intentSender, Intent intent, int i8, int i9) {
        t.g(intentSender, "intentSender");
        this.f19989a = intentSender;
        this.f19990b = intent;
        this.f19991c = i8;
        this.f19992d = i9;
    }

    public final Intent a() {
        return this.f19990b;
    }

    public final int b() {
        return this.f19991c;
    }

    public final int c() {
        return this.f19992d;
    }

    public final IntentSender d() {
        return this.f19989a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i8) {
        t.g(dest, "dest");
        dest.writeParcelable(this.f19989a, i8);
        dest.writeParcelable(this.f19990b, i8);
        dest.writeInt(this.f19991c);
        dest.writeInt(this.f19992d);
    }

    public /* synthetic */ g(IntentSender intentSender, Intent intent, int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(intentSender, (i10 & 2) != 0 ? null : intent, (i10 & 4) != 0 ? 0 : i8, (i10 & 8) != 0 ? 0 : i9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Parcel parcel) {
        t.g(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        t.d(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
