VPATH = ../../.././gdb/testsuite/gdb.threads
srcdir = ../../.././gdb/testsuite/gdb.threads

EXECUTABLES = pthreads

all info install-info dvi install uninstall installcheck check:
	@echo "Nothing to be done for $@..."

clean mostlyclean:
	-rm -f *~ *.o a.out xgdb *.x *.ci *.tmp core* $(EXECUTABLES)

distclean maintainer-clean realclean: clean
	-rm -f Makefile config.status config.log config.h
