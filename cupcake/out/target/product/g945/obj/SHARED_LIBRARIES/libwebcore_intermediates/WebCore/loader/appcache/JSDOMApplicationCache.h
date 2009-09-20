/*
    This file is part of the WebKit open source project.
    This file has been generated by generate-bindings.pl. DO NOT MODIFY!

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Library General Public
    License as published by the Free Software Foundation; either
    version 2 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Library General Public License for more details.

    You should have received a copy of the GNU Library General Public License
    along with this library; see the file COPYING.LIB.  If not, write to
    the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
    Boston, MA 02110-1301, USA.
*/

#ifndef JSDOMApplicationCache_h
#define JSDOMApplicationCache_h


#if ENABLE(OFFLINE_WEB_APPLICATIONS)

#include "JSDOMBinding.h"
#include <runtime/JSGlobalObject.h>
#include <runtime/ObjectPrototype.h>

namespace WebCore {

class DOMApplicationCache;

class JSDOMApplicationCache : public DOMObject {
    typedef DOMObject Base;
public:
    JSDOMApplicationCache(PassRefPtr<JSC::Structure>, PassRefPtr<DOMApplicationCache>);
    virtual ~JSDOMApplicationCache();
    static JSC::JSObject* createPrototype(JSC::ExecState*);
    virtual bool getOwnPropertySlot(JSC::ExecState*, const JSC::Identifier& propertyName, JSC::PropertySlot&);
    virtual void put(JSC::ExecState*, const JSC::Identifier& propertyName, JSC::JSValuePtr, JSC::PutPropertySlot&);
    virtual const JSC::ClassInfo* classInfo() const { return &s_info; }
    static const JSC::ClassInfo s_info;

    static PassRefPtr<JSC::Structure> createStructure(JSC::JSValuePtr prototype)
    {
        return JSC::Structure::create(prototype, JSC::TypeInfo(JSC::ObjectType));
    }

    virtual void mark();


    // Custom functions
    JSC::JSValuePtr addEventListener(JSC::ExecState*, const JSC::ArgList&);
    JSC::JSValuePtr removeEventListener(JSC::ExecState*, const JSC::ArgList&);
    DOMApplicationCache* impl() const { return m_impl.get(); }

private:
    RefPtr<DOMApplicationCache> m_impl;
};

JSC::JSValuePtr toJS(JSC::ExecState*, DOMApplicationCache*);
DOMApplicationCache* toDOMApplicationCache(JSC::JSValuePtr);

class JSDOMApplicationCachePrototype : public JSC::JSObject {
public:
    static JSC::JSObject* self(JSC::ExecState*);
    virtual const JSC::ClassInfo* classInfo() const { return &s_info; }
    static const JSC::ClassInfo s_info;
    virtual bool getOwnPropertySlot(JSC::ExecState*, const JSC::Identifier&, JSC::PropertySlot&);
    static PassRefPtr<JSC::Structure> createStructure(JSC::JSValuePtr prototype)
    {
        return JSC::Structure::create(prototype, JSC::TypeInfo(JSC::ObjectType));
    }
    JSDOMApplicationCachePrototype(PassRefPtr<JSC::Structure> structure) : JSC::JSObject(structure) { }
};

// Functions

JSC::JSValuePtr jsDOMApplicationCachePrototypeFunctionUpdate(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsDOMApplicationCachePrototypeFunctionSwapCache(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsDOMApplicationCachePrototypeFunctionAddEventListener(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsDOMApplicationCachePrototypeFunctionRemoveEventListener(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsDOMApplicationCachePrototypeFunctionDispatchEvent(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
// Attributes

JSC::JSValuePtr jsDOMApplicationCacheStatus(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
JSC::JSValuePtr jsDOMApplicationCacheOnchecking(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOnchecking(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsDOMApplicationCacheOnerror(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOnerror(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsDOMApplicationCacheOnnoupdate(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOnnoupdate(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsDOMApplicationCacheOndownloading(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOndownloading(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsDOMApplicationCacheOnprogress(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOnprogress(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsDOMApplicationCacheOnupdateready(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOnupdateready(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsDOMApplicationCacheOncached(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOncached(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsDOMApplicationCacheOnobsolete(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSDOMApplicationCacheOnobsolete(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
// Constants

JSC::JSValuePtr jsDOMApplicationCacheUNCACHED(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
JSC::JSValuePtr jsDOMApplicationCacheIDLE(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
JSC::JSValuePtr jsDOMApplicationCacheCHECKING(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
JSC::JSValuePtr jsDOMApplicationCacheDOWNLOADING(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
JSC::JSValuePtr jsDOMApplicationCacheUPDATEREADY(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
JSC::JSValuePtr jsDOMApplicationCacheOBSOLETE(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);

} // namespace WebCore

#endif // ENABLE(OFFLINE_WEB_APPLICATIONS)

#endif
