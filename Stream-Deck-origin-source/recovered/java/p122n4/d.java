package p122n4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p095k4.a;
import p131o4.InterfaceC2752d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2752d f30579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f30580c;

    public d(Context context, InterfaceC2752d interfaceC2752d, f fVar) {
        this.f30578a = context;
        this.f30579b = interfaceC2752d;
        this.f30580c = fVar;
    }

    @Override // p122n4.v
    public void a(e eVar, int i8) {
        b(eVar, i8, false);
    }

    @Override // p122n4.v
    public void b(e eVar, int i8, boolean z8) {
        ComponentName componentName = new ComponentName(this.f30578a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f30578a.getSystemService("jobscheduler");
        int iC = c(eVar);
        if (!z8 && d(jobScheduler, iC, i8)) {
            a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", eVar);
            return;
        }
        long jE1 = this.f30579b.E1(eVar);
        JobInfo.Builder builderC = this.f30580c.c(new JobInfo.Builder(iC, componentName), eVar.d(), jE1, i8);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i8);
        persistableBundle.putString("backendName", eVar.b());
        persistableBundle.putInt("priority", p155r4.a.a(eVar.d()));
        if (eVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(eVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", eVar, Integer.valueOf(iC), Long.valueOf(this.f30580c.g(eVar.d(), jE1, i8)), Long.valueOf(jE1), Integer.valueOf(i8));
        jobScheduler.schedule(builderC.build());
    }

    public int c(e eVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f30578a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(eVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(p155r4.a.a(eVar.d())).array());
        if (eVar.c() != null) {
            adler32.update(eVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i8, int i9) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i10 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i8) {
                if (i10 >= i9) {
                    return true;
                }
            }
        }
        return false;
    }
}
