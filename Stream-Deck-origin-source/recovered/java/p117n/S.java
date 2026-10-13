package p117n;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.mlkit.common.internal.ckI.WqXA;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p012b2.c;
import p054g.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class S extends c implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchView f30301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SearchableInfo f30302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f30303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WeakHashMap f30304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f30305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f30306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f30307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f30308t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f30309u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f30311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f30312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f30313y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f30314z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f30315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f30316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f30317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f30318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f30319e;

        public a(View view) {
            this.f30315a = (TextView) view.findViewById(R.id.text1);
            this.f30316b = (TextView) view.findViewById(R.id.text2);
            this.f30317c = (ImageView) view.findViewById(R.id.icon1);
            this.f30318d = (ImageView) view.findViewById(R.id.icon2);
            this.f30319e = (ImageView) view.findViewById(f.f22493q);
        }
    }

    public S(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f30306r = false;
        this.f30307s = 1;
        this.f30309u = -1;
        this.f30310v = -1;
        this.f30311w = -1;
        this.f30312x = -1;
        this.f30313y = -1;
        this.f30314z = -1;
        this.f30301m = searchView;
        this.f30302n = searchableInfo;
        this.f30305q = searchView.getSuggestionCommitIconResId();
        this.f30303o = context;
        this.f30304p = weakHashMap;
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    public static String v(Cursor cursor, int i8) {
        if (i8 == -1) {
            return null;
        }
        try {
            return cursor.getString(i8);
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e8);
            return null;
        }
    }

    public final void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p012b2.a, b2.b.a
    public void a(Cursor cursor) {
        if (this.f30306r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f30309u = cursor.getColumnIndex("suggest_text_1");
                this.f30310v = cursor.getColumnIndex("suggest_text_2");
                this.f30311w = cursor.getColumnIndex("suggest_text_2_url");
                this.f30312x = cursor.getColumnIndex("suggest_icon_1");
                this.f30313y = cursor.getColumnIndex("suggest_icon_2");
                this.f30314z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e8);
        }
    }

    @Override // p012b2.a, b2.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f30301m.getVisibility() == 0 && this.f30301m.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f30302n, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e8) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e8);
            }
        }
        return null;
    }

    @Override // p012b2.a, b2.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, WqXA.RqER);
        if (strN3 != null) {
            return strN3;
        }
        if (this.f30302n.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f30302n.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // p012b2.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i8 = this.f30314z;
        int i9 = i8 != -1 ? cursor.getInt(i8) : 0;
        if (aVar.f30315a != null) {
            y(aVar.f30315a, v(cursor, this.f30309u));
        }
        if (aVar.f30316b != null) {
            String strV = v(cursor, this.f30311w);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f30310v);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f30315a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f30315a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f30315a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f30315a.setMaxLines(1);
                }
            }
            y(aVar.f30316b, charSequenceK);
        }
        ImageView imageView = aVar.f30317c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f30318d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i10 = this.f30307s;
        if (i10 != 2 && (i10 != 1 || (i9 & 1) == 0)) {
            aVar.f30319e.setVisibility(8);
            return;
        }
        aVar.f30319e.setVisibility(0);
        aVar.f30319e.setTag(aVar.f30315a.getText());
        aVar.f30319e.setOnClickListener(this);
    }

    @Override // p012b2.c, p012b2.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(f.f22493q)).setImageResource(this.f30305q);
        return viewG;
    }

    @Override // p012b2.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View viewF = f(this.f30303o, b(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f30315a.setText(e8.toString());
            }
            return viewF;
        }
    }

    @Override // p012b2.a, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View viewG = g(this.f30303o, b(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f30315a.setText(e8.toString());
            }
            return viewG;
        }
    }

    @Override // p012b2.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable j(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f30304p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence k(CharSequence charSequence) {
        if (this.f30308t == null) {
            TypedValue typedValue = new TypedValue();
            this.f30303o.getTheme().resolveAttribute(p054g.a.f22368N, typedValue, true);
            this.f30308t = this.f30303o.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f30308t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f30303o.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("SuggestionsAdapter", e8.toString());
            return null;
        }
    }

    public final Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f30304p.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f30304p.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f30304p.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f30303o.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(b());
    }

    public final Drawable o() {
        Drawable drawableM = m(this.f30302n.getSearchActivity());
        return drawableM != null ? drawableM : this.f30303o.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f30301m.Q((CharSequence) tag);
        }
    }

    public final Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f30303o.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e8) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e8);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e9) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e9);
                }
                throw th;
            }
        } catch (FileNotFoundException e10) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
        return null;
    }

    public Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f30303o.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i8 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f30303o.getPackageName() + "/" + i8;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableD = I1.a.d(this.f30303o, i8);
            z(str2, drawableD);
            return drawableD;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    public final Drawable s(Cursor cursor) {
        int i8 = this.f30312x;
        if (i8 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i8));
        return drawableR != null ? drawableR : o();
    }

    public final Drawable t(Cursor cursor) {
        int i8 = this.f30313y;
        if (i8 == -1) {
            return null;
        }
        return r(cursor.getString(i8));
    }

    public Cursor u(SearchableInfo searchableInfo, String str, int i8) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i8 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i8));
        }
        return this.f30303o.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i8) {
        this.f30307s = i8;
    }

    public final void x(ImageView imageView, Drawable drawable, int i8) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i8);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f30304p.put(str, drawable.getConstantState());
        }
    }
}
