package S;

import A.AbstractC0890p0;
import A.J;
import H.FL.dCqzKmEghGTQ;
import Q.C;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import com.revenuecat.purchases.common.Constants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f9550a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f9551b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f9554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C f9555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C f9556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f9557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f9558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f9559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f9560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final S.g f9561l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements C {
        @Override // Q.C
        public String a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements C {
        @Override // Q.C
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements C {
        @Override // Q.C
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: renamed from: S.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0265d extends f {
        public C0265d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9567b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9568c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9569d = -1;

        /* JADX WARN: Code duplicated, block: B:32:0x0078  */
        /* JADX WARN: Code duplicated, block: B:34:0x007d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0082  */
        public f(String str, String str2) throws Throwable {
            int iY;
            int iY2;
            int iGlCreateProgram;
            try {
                iY = d.y(35633, str);
                try {
                    iY2 = d.y(35632, str2);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        try {
                            d.g("glCreateProgram");
                            GLES20.glAttachShader(iGlCreateProgram, iY);
                            d.g("glAttachShader");
                            GLES20.glAttachShader(iGlCreateProgram, iY2);
                            d.g("glAttachShader");
                            GLES20.glLinkProgram(iGlCreateProgram);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                            if (iArr[0] == 1) {
                                this.f9566a = iGlCreateProgram;
                                c();
                            } else {
                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                            }
                        } catch (IllegalArgumentException e8) {
                            e = e8;
                            if (iY != -1) {
                                GLES20.glDeleteShader(iY);
                            }
                            if (iY2 != -1) {
                                GLES20.glDeleteShader(iY2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        } catch (IllegalStateException e9) {
                            e = e9;
                            if (iY != -1) {
                                GLES20.glDeleteShader(iY);
                            }
                            if (iY2 != -1) {
                                GLES20.glDeleteShader(iY2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e10) {
                        e = e10;
                        iGlCreateProgram = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e11) {
                    e = e11;
                    iY2 = -1;
                    iGlCreateProgram = iY2;
                    if (iY != -1) {
                        GLES20.glDeleteShader(iY);
                    }
                    if (iY2 != -1) {
                        GLES20.glDeleteShader(iY2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e12) {
                e = e12;
                iY = -1;
                iY2 = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f9566a, "aPosition");
            this.f9569d = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f9566a, "uTransMatrix");
            this.f9567b = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f9566a, "uAlphaScale");
            this.f9568c = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f9566a);
        }

        public void d(float f8) {
            GLES20.glUniform1f(this.f9568c, f8);
            d.g("glUniform1f");
        }

        public void e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f9567b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f9566a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f9569d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f9569d, 2, 5126, false, 0, (Buffer) d.f9558i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9572g;

        public g(J j8, e eVar) {
            this(j8, g(j8, eVar));
        }

        public static C g(J j8, e eVar) {
            if (!j8.d()) {
                return d.f9554e;
            }
            T1.f.b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f9556g : d.f9555f;
        }

        @Override // S.d.f
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f9570e, 0);
            GLES20.glEnableVertexAttribArray(this.f9572g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f9572g, 2, 5126, false, 0, (Buffer) d.f9560k);
            d.g("glVertexAttribPointer");
        }

        public void h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f9571f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public g(J j8, C c8) {
            super(j8.d() ? d.f9553d : d.f9552c, d.v(c8));
            this.f9570e = -1;
            this.f9571f = -1;
            this.f9572g = -1;
            c();
        }

        public final void c() {
            c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f9566a, "sTexture");
            this.f9570e = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "sTexture");
            int i8 = this.f9566a;
            String str = yOZfxp.HLzsGNJAyL;
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i8, str);
            this.f9572g = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, str);
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f9566a, "uTexMatrix");
            this.f9571f = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uTexMatrix");
        }
    }

    public static void e(String str) {
        try {
            f(str);
        } catch (IllegalStateException e8) {
            AbstractC0890p0.d("GLUtils", e8.toString(), e8);
        }
    }

    public static void f(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void h(Thread thread) {
        T1.f.j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void i(AtomicBoolean atomicBoolean, boolean z8) {
        T1.f.j(z8 == atomicBoolean.get(), z8 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void j(int i8, String str) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer m(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i8, int i9) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i8, 12374, i9, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map o(J j8, Map map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i8 = 0; i8 < length; i8++) {
            e eVar2 = eVarArrValues[i8];
            C c8 = (C) map.get(eVar2);
            if (c8 != null) {
                gVar = new g(j8, c8);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(j8, eVar2);
            } else {
                T1.f.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (j8.d()) {
                    gVar = new C0265d();
                } else {
                    C c9 = (C) map.get(eVar);
                    gVar = c9 != null ? new g(j8, c9) : new g(j8, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i8 = iArr[0];
        GLES20.glBindTexture(36197, i8);
        g("glBindTexture " + i8);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i8;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void r(int i8) {
        GLES20.glDeleteFramebuffers(1, new int[]{i8}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i8) {
        GLES20.glDeleteTextures(1, new int[]{i8}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    public static String v(C c8) {
        try {
            String strA = c8.a("sTexture", "vTextureCoord");
            if (strA != null && strA.contains("vTextureCoord") && strA.contains("sTexture")) {
                return strA;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) T1.f.g(matcher.group(1))) + "." + ((String) T1.f.g(matcher.group(2)));
    }

    public static Size x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static int y(int i8, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i8);
        g("glCreateShader type=" + i8);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        AbstractC0890p0.l("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i8 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + strGlGetShaderInfoLog);
    }

    public static int z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i8) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i8, iArr, 0);
        return iArr[0];
    }

    static {
        Locale locale = Locale.US;
        String str = dCqzKmEghGTQ.tsfTOIldUuzoGDf;
        f9552c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", str, str);
        f9553d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", str, str);
        f9554e = new a();
        f9555f = new b();
        f9556g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f9557h = fArr;
        f9558i = m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f9559j = fArr2;
        f9560k = m(fArr2);
        f9561l = S.g.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static int[] k(String str, J j8) {
        int[] iArr = f9550a;
        if (j8.b() == 3) {
            if (str.contains(BpgIURjN.KvDcDTPoKhGsHRp)) {
                return f9551b;
            }
            AbstractC0890p0.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }
}
