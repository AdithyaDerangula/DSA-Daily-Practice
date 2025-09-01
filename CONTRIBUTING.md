# Contributing Guide 🤝

## Ground rules
- Be respectful and constructive.
- Prefer **readable code** with comments over clever one-liners.
- Include **time & space complexity**.
- File names: `YourName.ext` (e.g., `Adithya.py`), no spaces.

## Steps
1. **Fork** the repo and **clone** your fork.
2. Create a feature branch: `git checkout -b day-01-solution-adithya`.
3. Add your file under the correct day: `Problems/Day-XX/solutions/YourName.ext`.
4. Commit message style:
   - `feat: add <name> solution for Day 01`
   - `refactor: optimize two-pointer approach`
   - `docs: update Progress-Tracker`
5. Push and open a **Pull Request** from your fork to `main`.
6. Request a review and iterate if needed.

## Code style
- Python: use functions, avoid global state, add `if __name__ == "__main__":` for tests.
- Java: class per file, include `main` or JUnit tests.
- C++: prefer `<vector>`, `<unordered_map>`, avoid using namespace std in headers.

## Reviewing
- Be kind, explain trade-offs, suggest resources.
