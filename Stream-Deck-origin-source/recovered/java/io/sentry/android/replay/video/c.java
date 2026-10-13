package io.sentry.android.replay.video;

import C6.j;
import C6.k;
import C6.l;
import Z6.w;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.J2;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.android.replay.video.a f26914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f26915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f26916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaCodec f26917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f26918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaCodec.BufferInfo f26919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final io.sentry.android.replay.video.b f26920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Surface f26921i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26922a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z8 = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            t.f(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                String name = mediaCodecInfo.getName();
                t.f(name, "it.name");
                if (w.M(name, "c2.exynos", false, 2, null)) {
                    z8 = true;
                    break;
                }
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MediaFormat invoke() {
            int iA = c.this.g().a();
            try {
                MediaCodecInfo.VideoCapabilities videoCapabilities = c.this.e().getCodecInfo().getCapabilitiesForType(c.this.g().d()).getVideoCapabilities();
                if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iA))) {
                    c.this.h().getLogger().c(EnumC2596z2.DEBUG, "Encoder doesn't support the provided bitRate: " + iA + ", the value will be clamped to the closest one", new Object[0]);
                    Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iA));
                    t.f(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                    iA = ((Number) objClamp).intValue();
                }
            } catch (Throwable th) {
                c.this.h().getLogger().b(EnumC2596z2.DEBUG, "Could not retrieve MediaCodec info", th);
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(c.this.g().d(), c.this.g().f(), c.this.g().e());
            t.f(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", iA);
            mediaFormatCreateVideoFormat.setFloat("frame-rate", c.this.g().c());
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
            return mediaFormatCreateVideoFormat;
        }
    }

    public c(J2 options, io.sentry.android.replay.video.a muxerConfig, Function0 function0) {
        t.g(options, "options");
        t.g(muxerConfig, "muxerConfig");
        this.f26913a = options;
        this.f26914b = muxerConfig;
        this.f26915c = function0;
        l lVar = l.NONE;
        this.f26916d = k.a(lVar, a.f26922a);
        MediaCodec mediaCodecCreateByCodecName = d() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.d());
        t.f(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.f26917e = mediaCodecCreateByCodecName;
        this.f26918f = k.a(lVar, new b());
        this.f26919g = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.b().getAbsolutePath();
        t.f(absolutePath, "muxerConfig.file.absolutePath");
        this.f26920h = new io.sentry.android.replay.video.b(absolutePath, muxerConfig.c());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    public final void b(Bitmap image) {
        Surface surface;
        Canvas canvasLockCanvas;
        t.g(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        t.f(MANUFACTURER, "MANUFACTURER");
        if (w.K(MANUFACTURER, "xiaomi", true)) {
            surface = this.f26921i;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            t.f(MANUFACTURER, "MANUFACTURER");
            if (w.K(MANUFACTURER, "motorola", true)) {
                surface = this.f26921i;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                Surface surface2 = this.f26921i;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.f26921i;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        a(false);
    }

    public final long c() {
        return this.f26920h.a();
    }

    public final boolean d() {
        return ((Boolean) this.f26916d.getValue()).booleanValue();
    }

    public final MediaCodec e() {
        return this.f26917e;
    }

    public final MediaFormat f() {
        return (MediaFormat) this.f26918f.getValue();
    }

    public final io.sentry.android.replay.video.a g() {
        return this.f26914b;
    }

    public final J2 h() {
        return this.f26913a;
    }

    public final void i() {
        try {
            Function0 function0 = this.f26915c;
            if (function0 != null) {
                function0.invoke();
            }
            a(true);
            this.f26917e.stop();
            this.f26917e.release();
            Surface surface = this.f26921i;
            if (surface != null) {
                surface.release();
            }
            this.f26920h.d();
        } catch (Throwable th) {
            this.f26913a.getLogger().b(EnumC2596z2.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    public final void j() {
        this.f26917e.configure(f(), (Surface) null, (MediaCrypto) null, 1);
        this.f26921i = this.f26917e.createInputSurface();
        this.f26917e.start();
        a(false);
    }

    public final void a(boolean z8) {
        ByteBuffer byteBuffer;
        ILogger logger = this.f26913a.getLogger();
        EnumC2596z2 enumC2596z2 = EnumC2596z2.DEBUG;
        logger.c(enumC2596z2, "[Encoder]: drainCodec(" + z8 + ')', new Object[0]);
        if (z8) {
            this.f26913a.getLogger().c(enumC2596z2, yOZfxp.mpPzmeItXQur, new Object[0]);
            this.f26917e.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.f26917e.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.f26917e.dequeueOutputBuffer(this.f26919g, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z8) {
                    return;
                } else {
                    this.f26913a.getLogger().c(EnumC2596z2.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f26917e.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f26920h.b()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f26917e.getOutputFormat();
                t.f(outputFormat, "mediaCodec.outputFormat");
                this.f26913a.getLogger().c(EnumC2596z2.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                this.f26920h.e(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                this.f26913a.getLogger().c(EnumC2596z2.DEBUG, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, new Object[0]);
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((this.f26919g.flags & 2) != 0) {
                    this.f26913a.getLogger().c(EnumC2596z2.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    this.f26919g.size = 0;
                }
                if (this.f26919g.size != 0) {
                    if (!this.f26920h.b()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.f26920h.c(byteBuffer, this.f26919g);
                    this.f26913a.getLogger().c(EnumC2596z2.DEBUG, "[Encoder]: sent " + this.f26919g.size + " bytes to muxer", new Object[0]);
                }
                this.f26917e.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.f26919g.flags & 4) != 0) {
                    if (z8) {
                        this.f26913a.getLogger().c(EnumC2596z2.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                        return;
                    } else {
                        this.f26913a.getLogger().c(EnumC2596z2.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ c(J2 j8, io.sentry.android.replay.video.a aVar, Function0 function0, int i8, AbstractC2633k abstractC2633k) {
        this(j8, aVar, (i8 & 4) != 0 ? null : function0);
    }
}
