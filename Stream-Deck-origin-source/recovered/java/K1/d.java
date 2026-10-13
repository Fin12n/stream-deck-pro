package K1;

import D6.iIQ.BmWxZhjGfw;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f4511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f4512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4513c;

    public d(Shader shader, ColorStateList colorStateList, int i8) {
        this.f4511a = shader;
        this.f4512b = colorStateList;
        this.f4513c = i8;
    }

    public static d b(int i8) {
        return new d(null, null, i8);
    }

    public static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i8, Resources.Theme theme) {
        try {
            return a(resources, i8, theme);
        } catch (Exception e8) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e8);
            return null;
        }
    }

    public int e() {
        return this.f4513c;
    }

    public Shader f() {
        return this.f4511a;
    }

    public boolean h() {
        return this.f4511a != null;
    }

    public boolean i() {
        return h() || this.f4513c != 0;
    }

    public static d a(Resources resources, int i8, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i8);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals(kDsnNkYbBsI.NvS)) {
                if (name.equals("selector")) {
                    return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(BmWxZhjGfw.LtWvnDCjJ);
    }
}
