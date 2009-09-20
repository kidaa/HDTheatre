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

#ifndef JSLocation_h
#define JSLocation_h

#include "JSDOMBinding.h"
#include <runtime/JSGlobalObject.h>
#include <runtime/ObjectPrototype.h>

namespace WebCore {

class Location;

class JSLocation : public DOMObject {
    typedef DOMObject Base;
public:
    JSLocation(PassRefPtr<JSC::Structure>, PassRefPtr<Location>);
    virtual ~JSLocation();
    static JSC::JSObject* createPrototype(JSC::ExecState*);
    virtual bool getOwnPropertySlot(JSC::ExecState*, const JSC::Identifier& propertyName, JSC::PropertySlot&);
    bool customGetOwnPropertySlot(JSC::ExecState*, const JSC::Identifier&, JSC::PropertySlot&);
    virtual void put(JSC::ExecState*, const JSC::Identifier& propertyName, JSC::JSValuePtr, JSC::PutPropertySlot&);
    bool customPut(JSC::ExecState*, const JSC::Identifier&, JSC::JSValuePtr, JSC::PutPropertySlot&);
    virtual const JSC::ClassInfo* classInfo() const { return &s_info; }
    static const JSC::ClassInfo s_info;

    static PassRefPtr<JSC::Structure> createStructure(JSC::JSValuePtr prototype)
    {
        return JSC::Structure::create(prototype, JSC::TypeInfo(JSC::ObjectType));
    }

    virtual bool deleteProperty(JSC::ExecState*, const JSC::Identifier&);
    virtual void getPropertyNames(JSC::ExecState*, JSC::PropertyNameArray&);
    bool customGetPropertyNames(JSC::ExecState*, JSC::PropertyNameArray&);

    // Custom attributes
    void setHref(JSC::ExecState*, JSC::JSValuePtr);
    void setProtocol(JSC::ExecState*, JSC::JSValuePtr);
    void setHost(JSC::ExecState*, JSC::JSValuePtr);
    void setHostname(JSC::ExecState*, JSC::JSValuePtr);
    void setPort(JSC::ExecState*, JSC::JSValuePtr);
    void setPathname(JSC::ExecState*, JSC::JSValuePtr);
    void setSearch(JSC::ExecState*, JSC::JSValuePtr);
    void setHash(JSC::ExecState*, JSC::JSValuePtr);

    // Custom functions
    JSC::JSValuePtr assign(JSC::ExecState*, const JSC::ArgList&);
    JSC::JSValuePtr replace(JSC::ExecState*, const JSC::ArgList&);
    JSC::JSValuePtr reload(JSC::ExecState*, const JSC::ArgList&);
    JSC::JSValuePtr toString(JSC::ExecState*, const JSC::ArgList&);
    Location* impl() const { return m_impl.get(); }

private:
    RefPtr<Location> m_impl;
};

JSC::JSValuePtr toJS(JSC::ExecState*, Location*);
Location* toLocation(JSC::JSValuePtr);

class JSLocationPrototype : public JSC::JSObject {
public:
    static JSC::JSObject* self(JSC::ExecState*);
    virtual const JSC::ClassInfo* classInfo() const { return &s_info; }
    static const JSC::ClassInfo s_info;
    virtual bool getOwnPropertySlot(JSC::ExecState*, const JSC::Identifier&, JSC::PropertySlot&);
    static PassRefPtr<JSC::Structure> createStructure(JSC::JSValuePtr prototype)
    {
        return JSC::Structure::create(prototype, JSC::TypeInfo(JSC::ObjectType));
    }
    JSLocationPrototype(PassRefPtr<JSC::Structure> structure) : JSC::JSObject(structure) { }
};

// Functions

JSC::JSValuePtr jsLocationPrototypeFunctionAssign(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsLocationPrototypeFunctionReplace(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsLocationPrototypeFunctionReload(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsLocationPrototypeFunctionToString(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
// Attributes

JSC::JSValuePtr jsLocationHref(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationHref(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsLocationProtocol(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationProtocol(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsLocationHost(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationHost(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsLocationHostname(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationHostname(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsLocationPort(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationPort(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsLocationPathname(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationPathname(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsLocationSearch(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationSearch(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsLocationHash(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSLocationHash(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);

} // namespace WebCore

#endif
