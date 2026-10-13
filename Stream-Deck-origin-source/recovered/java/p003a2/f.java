package p003a2;

import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ListView f13058s;

    public f(ListView listView) {
        super(listView);
        this.f13058s = listView;
    }

    @Override // p003a2.a
    public boolean a(int i8) {
        return false;
    }

    @Override // p003a2.a
    public boolean b(int i8) {
        ListView listView = this.f13058s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i9 = firstVisiblePosition + childCount;
        if (i8 > 0) {
            if (i9 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i8 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p003a2.a
    public void j(int i8, int i9) {
        this.f13058s.scrollListBy(i9);
    }
}
