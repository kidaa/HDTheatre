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

#include "JSText.h"

#include <wtf/GetPtr.h>

#include "ExceptionCode.h"
#include "JSText.h"
#include "KURL.h"
#include "Text.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSText)

/* Hash table */

static const HashTableValue JSTextTableValues[3] =
{
    { "wholeText", DontDelete|ReadOnly, (intptr_t)jsTextWholeText, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsTextConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSTextTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 63, JSTextTableValues, 0 };
#else
    { 5, 3, JSTextTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSTextConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSTextConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSTextConstructorTableValues, 0 };
#else
    { 1, 0, JSTextConstructorTableValues, 0 };
#endif

class JSTextConstructor : public DOMObject {
public:
    JSTextConstructor(ExecState* exec)
        : DOMObject(JSTextConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSTextPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSTextConstructor::s_info = { "TextConstructor", 0, &JSTextConstructorTable, 0 };

bool JSTextConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSTextConstructor, DOMObject>(exec, &JSTextConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSTextPrototypeTableValues[3] =
{
    { "splitText", DontDelete|Function, (intptr_t)jsTextPrototypeFunctionSplitText, (intptr_t)1 },
    { "replaceWholeText", DontDelete|Function, (intptr_t)jsTextPrototypeFunctionReplaceWholeText, (intptr_t)1 },
    { 0, 0, 0, 0 }
};

static const HashTable JSTextPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 1, JSTextPrototypeTableValues, 0 };
#else
    { 4, 3, JSTextPrototypeTableValues, 0 };
#endif

const ClassInfo JSTextPrototype::s_info = { "TextPrototype", 0, &JSTextPrototypeTable, 0 };

JSObject* JSTextPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSText>(exec);
}

bool JSTextPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticFunctionSlot<JSObject>(exec, &JSTextPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSText::s_info = { "Text", &JSCharacterData::s_info, &JSTextTable, 0 };

JSText::JSText(PassRefPtr<Structure> structure, PassRefPtr<Text> impl)
    : JSCharacterData(structure, impl)
{
}

JSObject* JSText::createPrototype(ExecState* exec)
{
    return new (exec) JSTextPrototype(JSTextPrototype::createStructure(JSCharacterDataPrototype::self(exec)));
}

bool JSText::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSText, Base>(exec, &JSTextTable, this, propertyName, slot);
}

JSValuePtr jsTextWholeText(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Text* imp = static_cast<Text*>(static_cast<JSText*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->wholeText());
}

JSValuePtr jsTextConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSText*>(asObject(slot.slotBase()))->getConstructor(exec);
}
JSValuePtr JSText::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSTextConstructor>(exec);
}

JSValuePtr jsTextPrototypeFunctionSplitText(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSText::s_info))
        return throwError(exec, TypeError);
    JSText* castedThisObj = static_cast<JSText*>(asObject(thisValue));
    Text* imp = static_cast<Text*>(castedThisObj->impl());
    ExceptionCode ec = 0;
    int offset = args.at(exec, 0).toInt32(exec);
    if (offset < 0) {
        setDOMException(exec, INDEX_SIZE_ERR);
        return jsUndefined();
    }


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->splitText(offset, ec)));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsTextPrototypeFunctionReplaceWholeText(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSText::s_info))
        return throwError(exec, TypeError);
    JSText* castedThisObj = static_cast<JSText*>(asObject(thisValue));
    Text* imp = static_cast<Text*>(castedThisObj->impl());
    ExceptionCode ec = 0;
    const UString& content = args.at(exec, 0).toString(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->replaceWholeText(content, ec)));
    setDOMException(exec, ec);
    return result;
}


}
