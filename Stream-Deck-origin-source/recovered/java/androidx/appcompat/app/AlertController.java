package androidx.appcompat.app;

import U1.I;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p054g.f;
import p054g.j;
import p063h.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public NestedScrollView f13463A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f13465C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f13466D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f13467E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f13468F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f13469G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ListAdapter f13470H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f13472J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f13473K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f13474L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f13475M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f13476N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f13477O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f13478P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Handler f13480R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f13483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f13484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f13486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f13487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f13488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f13489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13494m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f13496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f13497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f13498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f13499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f13500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f13501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f13502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f13503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f13504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f13505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f13506y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f13507z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13495n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13464B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f13471I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f13479Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final View.OnClickListener f13481S = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13509b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z8, boolean z9) {
            if (z9 && z8) {
                return;
            }
            setPadding(getPaddingLeft(), z8 ? getPaddingTop() : this.f13508a, getPaddingRight(), z9 ? getPaddingBottom() : this.f13509b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f22657c2);
            this.f13509b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f22662d2, -1);
            this.f13508a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f22667e2, -1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f13496o && (message3 = alertController.f13498q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f13500s || (message2 = alertController.f13502u) == null) {
                messageObtain = (view != alertController.f13504w || (message = alertController.f13506y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f13480R.obtainMessage(1, alertController2.f13483b).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f13511A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f13512B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f13513C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f13514D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f13516F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f13517G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f13518H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f13520J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f13521K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f13522L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f13523M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f13524N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f13526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f13527b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f13529d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f13531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f13532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f13533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f13534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f13535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f13536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f13537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f13538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f13539n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f13540o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f13541p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f13542q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f13544s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f13545t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f13546u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f13547v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f13548w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f13549x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13550y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f13551z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13528c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13530e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f13515E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f13519I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f13525O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f13543r = true;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f13552a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i8, int i9, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i8, i9, charSequenceArr);
                this.f13552a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i8, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i8, view, viewGroup);
                boolean[] zArr = b.this.f13516F;
                if (zArr != null && zArr[i8]) {
                    this.f13552a.setItemChecked(i8, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0339b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f13554a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f13555b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f13556c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AlertController f13557d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0339b(Context context, Cursor cursor, boolean z8, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z8);
                this.f13556c = recycleListView;
                this.f13557d = alertController;
                Cursor cursor2 = getCursor();
                this.f13554a = cursor2.getColumnIndexOrThrow(b.this.f13522L);
                this.f13555b = cursor2.getColumnIndexOrThrow(b.this.f13523M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f13554a));
                this.f13556c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f13555b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f13527b.inflate(this.f13557d.f13475M, viewGroup, false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f13559a;

            public c(AlertController alertController) {
                this.f13559a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                b.this.f13549x.onClick(this.f13559a.f13483b, i8);
                if (b.this.f13518H) {
                    return;
                }
                this.f13559a.f13483b.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f13561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlertController f13562b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f13561a = recycleListView;
                this.f13562b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
                boolean[] zArr = b.this.f13516F;
                if (zArr != null) {
                    zArr[i8] = this.f13561a.isItemChecked(i8);
                }
                b.this.f13520J.onClick(this.f13562b.f13483b, i8, this.f13561a.isItemChecked(i8));
            }
        }

        public b(Context context) {
            this.f13526a = context;
            this.f13527b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f13532g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f13531f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f13529d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i8 = this.f13528c;
                if (i8 != 0) {
                    alertController.l(i8);
                }
                int i9 = this.f13530e;
                if (i9 != 0) {
                    alertController.l(alertController.c(i9));
                }
            }
            CharSequence charSequence2 = this.f13533h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f13534i;
            if (charSequence3 == null && this.f13535j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f13536k, null, this.f13535j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f13537l;
            if (charSequence4 != null || this.f13538m != null) {
                alertController2.j(-2, charSequence4, this.f13539n, null, this.f13538m);
            }
            CharSequence charSequence5 = this.f13540o;
            if (charSequence5 != null || this.f13541p != null) {
                alertController2.j(-3, charSequence5, this.f13542q, null, this.f13541p);
            }
            if (this.f13547v != null || this.f13521K != null || this.f13548w != null) {
                b(alertController2);
            }
            View view2 = this.f13551z;
            if (view2 != null) {
                if (this.f13515E) {
                    alertController2.s(view2, this.f13511A, this.f13512B, this.f13513C, this.f13514D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i10 = this.f13550y;
            if (i10 != 0) {
                alertController2.q(i10);
            }
        }

        public final void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f13527b.inflate(alertController.f13474L, (ViewGroup) null);
            if (!this.f13517G) {
                bVar = this;
                alertController2 = alertController;
                int i8 = bVar.f13518H ? alertController2.f13476N : alertController2.f13477O;
                if (bVar.f13521K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f13526a, i8, bVar.f13521K, new String[]{bVar.f13522L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f13548w;
                    if (dVar == null) {
                        dVar = new d(bVar.f13526a, i8, R.id.text1, bVar.f13547v);
                    }
                }
            } else if (this.f13521K == null) {
                bVar = this;
                dVar = bVar.new a(this.f13526a, alertController.f13475M, R.id.text1, this.f13547v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0339b(bVar.f13526a, bVar.f13521K, false, recycleListView, alertController2);
            }
            alertController2.f13470H = dVar;
            alertController2.f13471I = bVar.f13519I;
            if (bVar.f13549x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f13520J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f13524N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f13518H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f13517G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f13488g = recycleListView;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f13564a;

        public c(DialogInterface dialogInterface) {
            this.f13564a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == -3 || i8 == -2 || i8 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f13564a.get(), message.what);
            } else {
                if (i8 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends ArrayAdapter {
        public d(Context context, int i8, int i9, CharSequence[] charSequenceArr) {
            super(context, i8, i9, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, l lVar, Window window) {
        this.f13482a = context;
        this.f13483b = lVar;
        this.f13484c = window;
        this.f13480R = new c(lVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.f22560F, p054g.a.f22385o, 0);
        this.f13472J = typedArrayObtainStyledAttributes.getResourceId(j.f22564G, 0);
        this.f13473K = typedArrayObtainStyledAttributes.getResourceId(j.f22572I, 0);
        this.f13474L = typedArrayObtainStyledAttributes.getResourceId(j.f22580K, 0);
        this.f13475M = typedArrayObtainStyledAttributes.getResourceId(j.f22584L, 0);
        this.f13476N = typedArrayObtainStyledAttributes.getResourceId(j.f22592N, 0);
        this.f13477O = typedArrayObtainStyledAttributes.getResourceId(j.f22576J, 0);
        this.f13478P = typedArrayObtainStyledAttributes.getBoolean(j.f22588M, true);
        this.f13485d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f22568H, 0);
        typedArrayObtainStyledAttributes.recycle();
        lVar.k(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p054g.a.f22384n, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public int c(int i8) {
        TypedValue typedValue = new TypedValue();
        this.f13482a.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f13488g;
    }

    public void e() {
        this.f13483b.setContentView(i());
        x();
    }

    public boolean f(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13463A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13463A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public final ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int i() {
        int i8 = this.f13473K;
        if (i8 == 0) {
            return this.f13472J;
        }
        return this.f13479Q == 1 ? i8 : this.f13472J;
    }

    public void j(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f13480R.obtainMessage(i8, onClickListener);
        }
        if (i8 == -3) {
            this.f13505x = charSequence;
            this.f13506y = message;
            this.f13507z = drawable;
        } else if (i8 == -2) {
            this.f13501t = charSequence;
            this.f13502u = message;
            this.f13503v = drawable;
        } else {
            if (i8 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f13497p = charSequence;
            this.f13498q = message;
            this.f13499r = drawable;
        }
    }

    public void k(View view) {
        this.f13469G = view;
    }

    public void l(int i8) {
        this.f13465C = null;
        this.f13464B = i8;
        ImageView imageView = this.f13466D;
        if (imageView != null) {
            if (i8 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13466D.setImageResource(this.f13464B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f13465C = drawable;
        this.f13464B = 0;
        ImageView imageView = this.f13466D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f13466D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f13487f = charSequence;
        TextView textView = this.f13468F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void o(ViewGroup viewGroup, View view, int i8, int i9) {
        View viewFindViewById = this.f13484c.findViewById(f.f22497u);
        View viewFindViewById2 = this.f13484c.findViewById(f.f22496t);
        I.T(view, i8, i9);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void p(CharSequence charSequence) {
        this.f13486e = charSequence;
        TextView textView = this.f13467E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i8) {
        this.f13489h = null;
        this.f13490i = i8;
        this.f13495n = false;
    }

    public void r(View view) {
        this.f13489h = view;
        this.f13490i = 0;
        this.f13495n = false;
    }

    public void s(View view, int i8, int i9, int i10, int i11) {
        this.f13489h = view;
        this.f13490i = 0;
        this.f13495n = true;
        this.f13491j = i8;
        this.f13492k = i9;
        this.f13493l = i10;
        this.f13494m = i11;
    }

    public final void t(ViewGroup viewGroup) {
        int i8;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f13496o = button;
        button.setOnClickListener(this.f13481S);
        if (TextUtils.isEmpty(this.f13497p) && this.f13499r == null) {
            this.f13496o.setVisibility(8);
            i8 = 0;
        } else {
            this.f13496o.setText(this.f13497p);
            Drawable drawable = this.f13499r;
            if (drawable != null) {
                int i9 = this.f13485d;
                drawable.setBounds(0, 0, i9, i9);
                this.f13496o.setCompoundDrawables(this.f13499r, null, null, null);
            }
            this.f13496o.setVisibility(0);
            i8 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f13500s = button2;
        button2.setOnClickListener(this.f13481S);
        if (TextUtils.isEmpty(this.f13501t) && this.f13503v == null) {
            this.f13500s.setVisibility(8);
        } else {
            this.f13500s.setText(this.f13501t);
            Drawable drawable2 = this.f13503v;
            if (drawable2 != null) {
                int i10 = this.f13485d;
                drawable2.setBounds(0, 0, i10, i10);
                this.f13500s.setCompoundDrawables(this.f13503v, null, null, null);
            }
            this.f13500s.setVisibility(0);
            i8 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f13504w = button3;
        button3.setOnClickListener(this.f13481S);
        if (TextUtils.isEmpty(this.f13505x) && this.f13507z == null) {
            this.f13504w.setVisibility(8);
        } else {
            this.f13504w.setText(this.f13505x);
            Drawable drawable3 = this.f13507z;
            if (drawable3 != null) {
                int i11 = this.f13485d;
                drawable3.setBounds(0, 0, i11, i11);
                this.f13504w.setCompoundDrawables(this.f13507z, null, null, null);
            }
            this.f13504w.setVisibility(0);
            i8 |= 4;
        }
        if (y(this.f13482a)) {
            if (i8 == 1) {
                b(this.f13496o);
            } else if (i8 == 2) {
                b(this.f13500s);
            } else if (i8 == 4) {
                b(this.f13504w);
            }
        }
        if (i8 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f13484c.findViewById(f.f22498v);
        this.f13463A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f13463A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f13468F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f13487f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f13463A.removeView(this.f13468F);
        if (this.f13488g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f13463A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f13463A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f13488g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void v(ViewGroup viewGroup) {
        View viewInflate = this.f13489h;
        if (viewInflate == null) {
            viewInflate = this.f13490i != 0 ? LayoutInflater.from(this.f13482a).inflate(this.f13490i, viewGroup, false) : null;
        }
        boolean z8 = viewInflate != null;
        if (!z8 || !a(viewInflate)) {
            this.f13484c.setFlags(131072, 131072);
        }
        if (!z8) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f13484c.findViewById(f.f22490n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f13495n) {
            frameLayout.setPadding(this.f13491j, this.f13492k, this.f13493l, this.f13494m);
        }
        if (this.f13488g != null) {
            ((LinearLayout.LayoutParams) ((androidx.appcompat.widget.b.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void w(ViewGroup viewGroup) {
        if (this.f13469G != null) {
            viewGroup.addView(this.f13469G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f13484c.findViewById(f.f22475N).setVisibility(8);
            return;
        }
        this.f13466D = (ImageView) this.f13484c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f13486e) || !this.f13478P) {
            this.f13484c.findViewById(f.f22475N).setVisibility(8);
            this.f13466D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f13484c.findViewById(f.f22486j);
        this.f13467E = textView;
        textView.setText(this.f13486e);
        int i8 = this.f13464B;
        if (i8 != 0) {
            this.f13466D.setImageResource(i8);
            return;
        }
        Drawable drawable = this.f13465C;
        if (drawable != null) {
            this.f13466D.setImageDrawable(drawable);
        } else {
            this.f13467E.setPadding(this.f13466D.getPaddingLeft(), this.f13466D.getPaddingTop(), this.f13466D.getPaddingRight(), this.f13466D.getPaddingBottom());
            this.f13466D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f13484c.findViewById(f.f22495s);
        View viewFindViewById4 = viewFindViewById3.findViewById(f.f22476O);
        View viewFindViewById5 = viewFindViewById3.findViewById(f.f22489m);
        View viewFindViewById6 = viewFindViewById3.findViewById(f.f22487k);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(f.f22491o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(f.f22476O);
        View viewFindViewById8 = viewGroup.findViewById(f.f22489m);
        View viewFindViewById9 = viewGroup.findViewById(f.f22487k);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z8 = viewGroup.getVisibility() != 8;
        boolean z9 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z10 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z10 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(f.f22471J)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z9 != 0) {
            NestedScrollView nestedScrollView = this.f13463A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f13487f == null && this.f13488g == null) ? null : viewGroupH.findViewById(f.f22474M);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(f.f22472K)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f13488g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z9, z10);
        }
        if (!z8) {
            View view = this.f13488g;
            if (view == null) {
                view = this.f13463A;
            }
            if (view != null) {
                o(viewGroupH2, view, z9 | (z10 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f13488g;
        if (listView2 == null || (listAdapter = this.f13470H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = this.f13471I;
        if (i8 > -1) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }
}
