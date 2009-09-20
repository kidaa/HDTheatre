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

#include "config.h"

#include "JSPlugin.h"

#include <wtf/GetPtr.h>

#include <runtime/PropertyNameArray.h>
#include "AtomicString.h"
#include "JSMimeType.h"
#include "KURL.h"
#include "MimeType.h"
#include "Plugin.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSPlugin)

/* Hash table */

static const HashTableValue JSPluginTableValues[6] =
{
    { "name", DontDelete|ReadOnly, (intptr_t)jsPluginName, (intptr_t)0 },
    { "filename", DontDelete|ReadOnly, (intptr_t)jsPluginFilename, (intptr_t)0 },
    { "description", DontDelete|ReadOnly, (intptr_t)jsPluginDescription, (intptr_t)0 },
    { "length", DontDelete|ReadOnly, (intptr_t)jsPluginLength, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsPluginConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSPluginTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 127, JSPluginTableValues, 0 };
#else
    { 17, 15, JSPluginTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSPluginConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSPluginConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSPluginConstructorTableValues, 0 };
#else
    { 1, 0, JSPluginConstructorTableValues, 0 };
#endif

class JSPluginConstructor : public DOMObject {
public:
    JSPluginConstructor(ExecState* exec)
        : DOMObject(JSPluginConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSPluginPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSPluginConstructor::s_info = { "PluginConstructor", 0, &JSPluginConstructorTable, 0 };

bool JSPluginConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSPluginConstructor, DOMObject>(exec, &JSPluginConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSPluginPrototypeTableValues[3] =
{
    { "item", DontDelete|Function, (intptr_t)jsPluginPrototypeFunctionItem, (intptr_t)1 },
    { "namedItem", DontDelete|Function, (intptr_t)jsPluginPrototypeFunctionNamedItem, (intptr_t)1 },
    { 0, 0, 0, 0 }
};

static const HashTable JSPluginPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 7, JSPluginPrototypeTableValues, 0 };
#else
    { 5, 3, JSPluginPrototypeTableValues, 0 };
#endif

const ClassInfo JSPluginPrototype::s_info = { "PluginPrototype", 0, &JSPluginPrototypeTable, 0 };

JSObject* JSPluginPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSPlugin>(exec);
}

bool JSPluginPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticFunctionSlot<JSObject>(exec, &JSPluginPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSPlugin::s_info = { "Plugin", 0, &JSPluginTable, 0 };

JSPlugin::JSPlugin(PassRefPtr<Structure> structure, PassRefPtr<Plugin> impl)
    : DOMObject(structure)
    , m_impl(impl)
{
}

JSPlugin::~JSPlugin()
{
    forgetDOMObject(*Heap::heap(this)->globalData(), m_impl.get());

}

JSObject* JSPlugin::createPrototype(ExecState* exec)
{
    return new (exec) JSPluginPrototype(JSPluginPrototype::createStructure(exec->lexicalGlobalObject()->objectPrototype()));
}

bool JSPlugin::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    const HashEntry* entry = JSPluginTable.entry(exec, propertyName);
    if (entry) {
        slot.setCustom(this, entry->propertyGetter());
        return true;
    }
    bool ok;
    unsigned index = propertyName.toUInt32(&ok, false);
    if (ok && index < static_cast<Plugin*>(impl())->length()) {
        slot.setCustomIndex(this, index, indexGetter);
        return true;
    }
    if (canGetItemsForName(exec, static_cast<Plugin*>(impl()), propertyName)) {
        slot.setCustom(this, nameGetter);
        return true;
    }
    return getStaticValueSlot<JSPlugin, Base>(exec, &JSPluginTable, this, propertyName, slot);
}

bool JSPlugin::getOwnPropertySlot(ExecState* exec, unsigned propertyName, PropertySlot& slot)
{
    if (propertyName < static_cast<Plugin*>(impl())->length()) {
        slot.setCustomIndex(this, propertyName, indexGetter);
        return true;
    }
    return getOwnPropertySlot(exec, Identifier::from(exec, propertyName), slot);
}

JSValuePtr jsPluginName(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Plugin* imp = static_cast<Plugin*>(static_cast<JSPlugin*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->name());
}

JSValuePtr jsPluginFilename(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Plugin* imp = static_cast<Plugin*>(static_cast<JSPlugin*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->filename());
}

JSValuePtr jsPluginDescription(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Plugin* imp = static_cast<Plugin*>(static_cast<JSPlugin*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->description());
}

JSValuePtr jsPluginLength(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Plugin* imp = static_cast<Plugin*>(static_cast<JSPlugin*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->length());
}

JSValuePtr jsPluginConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSPlugin*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSPlugin::getPropertyNames(ExecState* exec, PropertyNameArray& propertyNames)
{
    for (unsigned i = 0; i < static_cast<Plugin*>(impl())->length(); ++i)
        propertyNames.add(Identifier::from(exec, i));
     Base::getPropertyNames(exec, propertyNames);
}

JSValuePtr JSPlugin::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSPluginConstructor>(exec);
}

JSValuePtr jsPluginPrototypeFunctionItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSPlugin::s_info))
        return throwError(exec, TypeError);
    JSPlugin* castedThisObj = static_cast<JSPlugin*>(asObject(thisValue));
    Plugin* imp = static_cast<Plugin*>(castedThisObj->impl());
    unsigned index = args.at(exec, 0).toInt32(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->item(index)));
    return result;
}

JSValuePtr jsPluginPrototypeFunctionNamedItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSPlugin::s_info))
        return throwError(exec, TypeError);
    JSPlugin* castedThisObj = static_cast<JSPlugin*>(asObject(thisValue));
    Plugin* imp = static_cast<Plugin*>(castedThisObj->impl());
    const UString& name = args.at(exec, 0).toString(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->namedItem(name)));
    return result;
}


JSValuePtr JSPlugin::indexGetter(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    JSPlugin* thisObj = static_cast<JSPlugin*>(asObject(slot.slotBase()));
    return toJS(exec, static_cast<Plugin*>(thisObj->impl())->item(slot.index()));
}
JSC::JSValuePtr toJS(JSC::ExecState* exec, Plugin* object)
{
    return getDOMObjectWrapper<JSPlugin>(exec, object);
}
Plugin* toPlugin(JSC::JSValuePtr value)
{
    return value.isObject(&JSPlugin::s_info) ? static_cast<JSPlugin*>(asObject(value))->impl() : 0;
}

}
