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

#include "JSKeyboardEvent.h"

#include <wtf/GetPtr.h>

#include "JSDOMWindow.h"
#include "KURL.h"
#include "KeyboardEvent.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSKeyboardEvent)

/* Hash table */

static const HashTableValue JSKeyboardEventTableValues[9] =
{
    { "keyIdentifier", DontDelete|ReadOnly, (intptr_t)jsKeyboardEventKeyIdentifier, (intptr_t)0 },
    { "keyLocation", DontDelete|ReadOnly, (intptr_t)jsKeyboardEventKeyLocation, (intptr_t)0 },
    { "ctrlKey", DontDelete|ReadOnly, (intptr_t)jsKeyboardEventCtrlKey, (intptr_t)0 },
    { "shiftKey", DontDelete|ReadOnly, (intptr_t)jsKeyboardEventShiftKey, (intptr_t)0 },
    { "altKey", DontDelete|ReadOnly, (intptr_t)jsKeyboardEventAltKey, (intptr_t)0 },
    { "metaKey", DontDelete|ReadOnly, (intptr_t)jsKeyboardEventMetaKey, (intptr_t)0 },
    { "altGraphKey", DontDelete|ReadOnly, (intptr_t)jsKeyboardEventAltGraphKey, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsKeyboardEventConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSKeyboardEventTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 31, JSKeyboardEventTableValues, 0 };
#else
    { 18, 15, JSKeyboardEventTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSKeyboardEventConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSKeyboardEventConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSKeyboardEventConstructorTableValues, 0 };
#else
    { 1, 0, JSKeyboardEventConstructorTableValues, 0 };
#endif

class JSKeyboardEventConstructor : public DOMObject {
public:
    JSKeyboardEventConstructor(ExecState* exec)
        : DOMObject(JSKeyboardEventConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSKeyboardEventPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSKeyboardEventConstructor::s_info = { "KeyboardEventConstructor", 0, &JSKeyboardEventConstructorTable, 0 };

bool JSKeyboardEventConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSKeyboardEventConstructor, DOMObject>(exec, &JSKeyboardEventConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSKeyboardEventPrototypeTableValues[2] =
{
    { "initKeyboardEvent", DontDelete|Function, (intptr_t)jsKeyboardEventPrototypeFunctionInitKeyboardEvent, (intptr_t)11 },
    { 0, 0, 0, 0 }
};

static const HashTable JSKeyboardEventPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSKeyboardEventPrototypeTableValues, 0 };
#else
    { 2, 1, JSKeyboardEventPrototypeTableValues, 0 };
#endif

const ClassInfo JSKeyboardEventPrototype::s_info = { "KeyboardEventPrototype", 0, &JSKeyboardEventPrototypeTable, 0 };

JSObject* JSKeyboardEventPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSKeyboardEvent>(exec);
}

bool JSKeyboardEventPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticFunctionSlot<JSObject>(exec, &JSKeyboardEventPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSKeyboardEvent::s_info = { "KeyboardEvent", &JSUIEvent::s_info, &JSKeyboardEventTable, 0 };

JSKeyboardEvent::JSKeyboardEvent(PassRefPtr<Structure> structure, PassRefPtr<KeyboardEvent> impl)
    : JSUIEvent(structure, impl)
{
}

JSObject* JSKeyboardEvent::createPrototype(ExecState* exec)
{
    return new (exec) JSKeyboardEventPrototype(JSKeyboardEventPrototype::createStructure(JSUIEventPrototype::self(exec)));
}

bool JSKeyboardEvent::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSKeyboardEvent, Base>(exec, &JSKeyboardEventTable, this, propertyName, slot);
}

JSValuePtr jsKeyboardEventKeyIdentifier(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->keyIdentifier());
}

JSValuePtr jsKeyboardEventKeyLocation(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->keyLocation());
}

JSValuePtr jsKeyboardEventCtrlKey(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->ctrlKey());
}

JSValuePtr jsKeyboardEventShiftKey(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->shiftKey());
}

JSValuePtr jsKeyboardEventAltKey(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->altKey());
}

JSValuePtr jsKeyboardEventMetaKey(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->metaKey());
}

JSValuePtr jsKeyboardEventAltGraphKey(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->altGraphKey());
}

JSValuePtr jsKeyboardEventConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSKeyboardEvent*>(asObject(slot.slotBase()))->getConstructor(exec);
}
JSValuePtr JSKeyboardEvent::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSKeyboardEventConstructor>(exec);
}

JSValuePtr jsKeyboardEventPrototypeFunctionInitKeyboardEvent(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSKeyboardEvent::s_info))
        return throwError(exec, TypeError);
    JSKeyboardEvent* castedThisObj = static_cast<JSKeyboardEvent*>(asObject(thisValue));
    KeyboardEvent* imp = static_cast<KeyboardEvent*>(castedThisObj->impl());
    const UString& type = args.at(exec, 0).toString(exec);
    bool canBubble = args.at(exec, 1).toBoolean(exec);
    bool cancelable = args.at(exec, 2).toBoolean(exec);
    DOMWindow* view = toDOMWindow(args.at(exec, 3));
    const UString& keyIdentifier = args.at(exec, 4).toString(exec);
    unsigned keyLocation = args.at(exec, 5).toInt32(exec);
    bool ctrlKey = args.at(exec, 6).toBoolean(exec);
    bool altKey = args.at(exec, 7).toBoolean(exec);
    bool shiftKey = args.at(exec, 8).toBoolean(exec);
    bool metaKey = args.at(exec, 9).toBoolean(exec);
    bool altGraphKey = args.at(exec, 10).toBoolean(exec);

    imp->initKeyboardEvent(type, canBubble, cancelable, view, keyIdentifier, keyLocation, ctrlKey, altKey, shiftKey, metaKey, altGraphKey);
    return jsUndefined();
}


}
