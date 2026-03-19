# Intermediate CSS Module Start #

## Property: `display`

### ⚠️ Important Note (HTML Rules)
You **cannot** place a `<div>` inside a `<p>` (paragraph) tag. If you do, the browser will break the paragraph structure because `<div>` is a block element and `<p>` cannot contain block elements.

1. `display: block`
* **Examples:** `<div>`, `<p>`, `<h1>`, `<section>`
* Occupies the **entire line** (width: 100% by default).
* The next element is forced onto the **next line**.
* **Key feature:** You **CAN** set specific `width` and `height`.

2. `display: inline`
* **Examples:** `<span>`, `<a>`, `<strong>`
* Only occupies the space necessary for its content.
* Stays on the **same line** as other elements.
* **Key feature:** You **CANNOT** change its `width` or `height` (CSS dimensions are ignored).

3. `display: inline-block`
* A hybrid between `inline` and `block`.
* **Behavior:** Keeps the `inline` flow (stays on the same line).
* **Power:** Allows you to change `width` and `height` (like a block element).

4. `display: none`
* Removes the element from the document flow completely.
* It is **not shown** on the screen.