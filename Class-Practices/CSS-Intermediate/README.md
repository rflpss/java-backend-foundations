# Intermediate CSS Module Start

## Property: `display`

### ⚠️ Important Note (HTML Rules)
You **cannot** place a `<div>` inside a `<p>` (paragraph) tag. If you do, the browser will break the paragraph structure because `<div>` is a block element and `<p>` cannot contain block elements.

### 1. `display: block`
* **Examples:** `<div>`, `<p>`, `<h1>`, `<section>`
* Occupies the **entire line** (width: 100% by default).
* The next element is forced onto the **next line**.
* **Key feature:** You **CAN** set specific `width` and `height`.

### 2. `display: inline`
* **Examples:** `<span>`, `<a>`, `<strong>`
* Only occupies the space necessary for its content.
* Stays on the **same line** as other elements.
* **Key feature:** You **CANNOT** change its `width` or `height` (CSS dimensions are ignored).

### 3. `display: inline-block`
* A hybrid between `inline` and `block`.
* **Behavior:** Keeps the `inline` flow (stays on the same line).
* **Power:** Allows you to change `width` and `height` (like a block element).

### 4. `display: none`
* Removes the element from the document flow completely.
* It is **not shown** on the screen.


---

## Property: `position`

### 1. `position: static` (Default)
* **Behavior:** The default state for all elements.
* Elements follow the normal document flow: they appear one after another (block) or side-by-side (inline).
* **Note:** `top`, `left`, `right`, and `bottom` properties have **no effect**.

### 2. `position: relative`
* **Behavior:** The element remains in the normal flow, but is unlocked.
* **Key feature:** Allows you to use `top`, `left`, `right`, and `bottom` to offset the element **relative to its original position**.
* **Impact:** Moving it does **not** affect the layout of surrounding elements (it leaves a "ghost" space where it used to be).

### 3. `position: absolute`
* **Behavior:** The element is **removed** from the normal document flow (other elements act like it doesn't exist anymore).
* **Positioning Context:** It positions itself relative to the nearest **ancestor (parent)** that has a position other than `static` (usually a parent with `relative`).
* If no positioned parent is found, it positions itself relative to the page body.

### 4. `position: fixed`
* **Behavior:** Also removed from the normal flow.
* **Positioning Context:** It positions itself relative to the **Viewport** (the browser window).
* **Key feature:** It **stays fixed** on the screen even when you scroll the page (perfect for headers or sticky buttons).

### 5. `position: sticky`
* **Behavior:** A hybrid between `relative` and `fixed`.
* It acts like `relative` until the scroll reaches a specific threshold (e.g., `top: 0`), then it "sticks" to the screen like `fixed`.

---

## Responsive Design: `@media` Queries

### 1. The Concept
Allows the website to change its layout based on the screen size (Mobile vs. Desktop).

### 2. The Golden Rule (Meta Tag)
For media queries to work on mobile devices, this tag is **mandatory** inside the `<head>` of the HTML:
`<meta name="viewport" content="width=device-width, initial-scale=1.0">`

### 3. Syntax Example
```css
/* Default styles (Desktop/General) */
body { background-color: blue; }

/* Styles for screens smaller than 600px (Mobile) */
@media screen and (max-width: 600px) {
    body { background-color: red; }
}
