package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Rsrcc_src_dstc_dst_fldBDD extends Rsrcc_src_dstc_dst_fld {
    private final jedd.internal.RelationContainer bdd =
      new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), src.v(), dstc.v(), dst.v(), fld.v() },
                                          new PhysicalDomain[] { C1.v(), V1.v(), C2.v(), V2.v(), FD.v() },
                                          ("private <soot.jimple.paddle.bdddomains.srcc:soot.jimple.padd" +
                                           "le.bdddomains.C1, soot.jimple.paddle.bdddomains.src:soot.jim" +
                                           "ple.paddle.bdddomains.V1, soot.jimple.paddle.bdddomains.dstc" +
                                           ":soot.jimple.paddle.bdddomains.C2, soot.jimple.paddle.bdddom" +
                                           "ains.dst:soot.jimple.paddle.bdddomains.V2, soot.jimple.paddl" +
                                           "e.bdddomains.fld:soot.jimple.paddle.bdddomains.FD> bdd at /t" +
                                           "mp/olhotak/soot-trunk/src/soot/jimple/paddle/queue/Rsrcc_src" +
                                           "_dstc_dst_fldBDD.jedd:31,12-54"));
    
    void add(final jedd.internal.RelationContainer tuple) { bdd.eqUnion(tuple); }
    
    public Rsrcc_src_dstc_dst_fldBDD(final jedd.internal.RelationContainer bdd, String name) {
        this(name);
        add(new jedd.internal.RelationContainer(new Attribute[] { dstc.v(), fld.v(), dst.v(), src.v(), srcc.v() },
                                                new PhysicalDomain[] { C2.v(), FD.v(), V2.v(), V1.v(), C1.v() },
                                                ("add(bdd) at /tmp/olhotak/soot-trunk/src/soot/jimple/paddle/q" +
                                                 "ueue/Rsrcc_src_dstc_dst_fldBDD.jedd:33,114-117"),
                                                bdd));
    }
    
    Rsrcc_src_dstc_dst_fldBDD(String name) {
        super(name);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
    }
    
    public Iterator iterator() {
        ;
        return new Iterator() {
            private Iterator it;
            
            public boolean hasNext() {
                if (it != null && it.hasNext()) return true;
                if (!jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD()))
                    return true;
                return false;
            }
            
            public Object next() {
                if (it == null || !it.hasNext()) {
                    it =
                      new jedd.internal.RelationContainer(new Attribute[] { dstc.v(), fld.v(), dst.v(), src.v(), srcc.v() },
                                                          new PhysicalDomain[] { C2.v(), FD.v(), V2.v(), V1.v(), C1.v() },
                                                          ("bdd.iterator(new jedd.Attribute[...]) at /tmp/olhotak/soot-t" +
                                                           "runk/src/soot/jimple/paddle/queue/Rsrcc_src_dstc_dst_fldBDD." +
                                                           "jedd:45,25-28"),
                                                          bdd).iterator(new Attribute[] { srcc.v(), src.v(), dstc.v(), dst.v(), fld.v() });
                    bdd.eq(jedd.internal.Jedd.v().falseBDD());
                }
                Object[] components = (Object[]) it.next();
                return new Tuple((Context) components[0],
                                 (VarNode) components[1],
                                 (Context) components[2],
                                 (VarNode) components[3],
                                 (PaddleField) components[4]);
            }
            
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    
    public jedd.internal.RelationContainer get() {
        final jedd.internal.RelationContainer ret =
          new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), src.v(), dstc.v(), dst.v(), fld.v() },
                                              new PhysicalDomain[] { C1.v(), V1.v(), C2.v(), V2.v(), FD.v() },
                                              ("<soot.jimple.paddle.bdddomains.srcc:soot.jimple.paddle.bdddo" +
                                               "mains.C1, soot.jimple.paddle.bdddomains.src:soot.jimple.padd" +
                                               "le.bdddomains.V1, soot.jimple.paddle.bdddomains.dstc:soot.ji" +
                                               "mple.paddle.bdddomains.C2, soot.jimple.paddle.bdddomains.dst" +
                                               ":soot.jimple.paddle.bdddomains.V2, soot.jimple.paddle.bdddom" +
                                               "ains.fld:soot.jimple.paddle.bdddomains.FD> ret = bdd; at /tm" +
                                               "p/olhotak/soot-trunk/src/soot/jimple/paddle/queue/Rsrcc_src_" +
                                               "dstc_dst_fldBDD.jedd:55,51-54"),
                                              bdd);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
        return new jedd.internal.RelationContainer(new Attribute[] { dstc.v(), fld.v(), dst.v(), src.v(), srcc.v() },
                                                   new PhysicalDomain[] { C2.v(), FD.v(), V2.v(), V1.v(), C1.v() },
                                                   ("return ret; at /tmp/olhotak/soot-trunk/src/soot/jimple/paddl" +
                                                    "e/queue/Rsrcc_src_dstc_dst_fldBDD.jedd:57,8-14"),
                                                   ret);
    }
    
    public boolean hasNext() {
        return !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD());
    }
}