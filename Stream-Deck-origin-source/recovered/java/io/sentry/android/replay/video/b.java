package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaMuxer f26908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26912f;

    public b(String path, float f8) {
        t.g(path, "path");
        this.f26907a = (long) (TimeUnit.SECONDS.toMicros(1L) / f8);
        this.f26908b = new MediaMuxer(path, 0);
    }

    public long a() {
        if (this.f26911e == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.f26912f + this.f26907a, TimeUnit.MICROSECONDS);
    }

    public boolean b() {
        return this.f26909c;
    }

    public void c(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        t.g(encodedData, "encodedData");
        t.g(bufferInfo, "bufferInfo");
        long j8 = this.f26907a;
        int i8 = this.f26911e;
        this.f26911e = i8 + 1;
        long j9 = j8 * ((long) i8);
        this.f26912f = j9;
        bufferInfo.presentationTimeUs = j9;
        this.f26908b.writeSampleData(this.f26910d, encodedData, bufferInfo);
    }

    public void d() {
        this.f26908b.stop();
        this.f26908b.release();
    }

    public void e(MediaFormat videoFormat) {
        t.g(videoFormat, "videoFormat");
        this.f26910d = this.f26908b.addTrack(videoFormat);
        this.f26908b.start();
        this.f26909c = true;
    }
}
